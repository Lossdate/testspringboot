package com.testspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        User user = iUserRepository.findByNameLike(name).get(0);
        return user;
    }
    @RequestMapping("/getUserList")
    public List<User> getUserList(String name) {
        List<User> userList = iUserRepository.findAll();
        return userList;
    }
    @PostMapping(value = "addUser")
    public User addUser(@RequestParam("name") String name, @RequestParam("age") Integer age, @RequestParam("sex") String sex) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        return iUserRepository.save(user);
    }
}
