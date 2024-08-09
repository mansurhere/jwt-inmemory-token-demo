package com.jwt.security.jwtsecuritydemo.service;

import com.jwt.security.jwtsecuritydemo.modal.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServices {

    public List<User> store = new ArrayList<>();

    public UserServices() {
        store.add(new User(UUID.randomUUID().toString(), "Mansur", "abc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Alam", "abc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Su", "abc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "BU", "abc@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
