package com.example.demoserviceprovider.controller;

import com.example.demoserviceprovider.model.User;
import com.example.demoserviceprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/get/{id}")
    public User getById(@PathVariable(value = "id") long id){
        return userService.get(id);
    }

}
