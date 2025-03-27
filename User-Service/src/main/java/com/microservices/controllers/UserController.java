package com.microservices.controllers;

import com.microservices.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public User getUser(){
        User user = new User();
        user.setFullName("Ramlakhan Lodhi");
        user.setEmail("ramlakhan@gmail.com");
        user.setPhone("7999326743");
        return user;
    }
}
