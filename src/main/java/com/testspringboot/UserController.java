package com.testspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xsyzx on 2018/6/7.
 */
@RestController
@SpringBootApplication
@RequestMapping("/test")
public class UserController {
    @Autowired
    IUserRepository iUserRepository;
    @RequestMapping("/getUser")
    public User getUser(String name) {
        User user = iUserRepository.findByName(name).get(0);
        return user;
    }
}
