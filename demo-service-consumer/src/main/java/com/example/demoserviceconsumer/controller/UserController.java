package com.example.demoserviceconsumer.controller;

import com.example.demoserviceconsumer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/get/{id}")
    public User get(@PathVariable(value = "id") long id){
        return restTemplate.getForObject("http://127.0.0.1:8080/get/"+id,User.class);
    }
}
