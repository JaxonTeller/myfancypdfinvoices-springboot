package com.nishikant.myfancypdfinvoices.springboot.service;

import com.nishikant.myfancypdfinvoices.springboot.model.User;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserService {

    public User findById(String userId){
        //for now always return a user
        return new User(userId, UUID.randomUUID().toString());
    }
}
