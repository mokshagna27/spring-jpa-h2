package com.mokshagna.JPA_H2.controller;

import com.mokshagna.JPA_H2.model.User;
import com.mokshagna.JPA_H2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")

public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);


    }
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();

    }
}
