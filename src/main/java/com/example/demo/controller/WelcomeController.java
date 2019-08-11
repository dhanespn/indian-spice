package com.example.demo.controller;

import com.example.demo.dto.Login;
import com.example.demo.entities.UserCatagory;
import com.example.demo.entities.UserDetails;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class WelcomeController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public String register(UserDetails user){
        System.out.println(user.getFirstName());
        return "null";
    }

    @RequestMapping("/userCatagory")
    public Iterable<UserCatagory> hh(){
        return userService.getUserCatagory();
    }


    @PostMapping("/login")
    public String login(@RequestBody Login login){
        return null;
    }
}
