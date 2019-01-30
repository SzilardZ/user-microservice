package com.codecool.usermicroservice.util;

import com.codecool.usermicroservice.model.User;
import com.codecool.usermicroservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Initializer {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void init() {
        User user = new User("user1", "01234");
        userService.add(user);
    }

}
