package com.testspringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xsyzx on 2018/6/7.
 */
@RestController
@RequestMapping("/test/")
public class Controller {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${content}")
    private String content;

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot! " + content;
    }

}
