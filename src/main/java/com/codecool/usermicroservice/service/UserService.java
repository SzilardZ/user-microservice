package com.codecool.usermicroservice.service;

import com.codecool.usermicroservice.model.User;
import com.codecool.usermicroservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void add(User user) {
        userRepository.save(user);
    }

}
