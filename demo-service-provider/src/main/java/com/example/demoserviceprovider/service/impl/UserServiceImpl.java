package com.example.demoserviceprovider.service.impl;

import com.example.demoserviceprovider.model.User;
import com.example.demoserviceprovider.repository.UserRepository;
import com.example.demoserviceprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User get(long id) {
        return userRepository.getById(id);
    }
}
