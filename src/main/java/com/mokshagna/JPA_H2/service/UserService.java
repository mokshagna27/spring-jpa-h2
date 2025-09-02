package com.mokshagna.JPA_H2.service;

import com.mokshagna.JPA_H2.model.User;
import com.mokshagna.JPA_H2.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(final User user){
        return userRepository.save(user);


    }
    public List<User> getAllUsers(){
        return userRepository.findAll();

    }

}
