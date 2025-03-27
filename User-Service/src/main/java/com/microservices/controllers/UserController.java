package com.microservices.controllers;

import com.microservices.model.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public User getUser(){
        User user = new User();
        user.setFullName("Ramlakhan Lodhi");
        user.setEmail("ramlakhan@gmail.com");
        user.setPhone("7999326743");
        return user;
    }
}
