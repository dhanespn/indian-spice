package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String loginMessage(){
        return "welcome";
    }

    @RequestMapping("/")
    public String hh(){
        return "index";
    }
    
    @RequestMapping("/edit-todo")
    public String editMessage(){
        return "welcome";
    }
}
