package com.jwt.security.jwtsecuritydemo.controller;

import com.jwt.security.jwtsecuritydemo.modal.User;
import com.jwt.security.jwtsecuritydemo.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserServices userServices;

    //http://localhost:8081/home/user
    @GetMapping("/user")
    public List<User> getUsers() {

        return userServices.getUsers();
    }

    @GetMapping("/current-user")
    public String getCurrentLogInUsers(Principal principal) {

        return principal.getName();
    }
}
