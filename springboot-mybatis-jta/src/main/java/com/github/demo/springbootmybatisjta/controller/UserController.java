package com.github.demo.springbootmybatisjta.controller;

import com.github.demo.springbootmybatisjta.config.DataSourceLuckDogProperties;
import com.github.demo.springbootmybatisjta.entity.User;
import com.github.demo.springbootmybatisjta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSourceLuckDogProperties dataSourceLuckDogProperties;

    @RequestMapping("/addUer")
    public String addUer(){
        userService.addUser();
        return "添加成功";
    }

    @RequestMapping("/luckdog")
    public List<User> luckdog(){
        List<User> list = userService.getLuckDogUser();
        return list;
    }

    @RequestMapping("/test")
    public List<User> test(){
        List<User> list = userService.getTestUser();
        return list;
    }

    @RequestMapping("/content")
    public String content () {
        return "";
    }


}
