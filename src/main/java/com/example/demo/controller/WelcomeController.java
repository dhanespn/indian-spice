package com.example.demo.controller;

import com.example.demo.dto.Login;
import com.example.demo.entities.UserCatagory;
import com.example.demo.entities.UserDetails;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class WelcomeController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/register", consumes=MediaType.MULTIPART_FORM_DATA_VALUE )
    public ResponseEntity<String> register(@ModelAttribute("multiPartsRequestPayload") UserDetails user){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+user.getFirstName());
        long userId = userService.insertUser(user);
        return new ResponseEntity<>(userId + "is created", HttpStatus.CREATED);
    }

    @RequestMapping("/userCatagory")
    public Iterable<UserCatagory> hh(){
        return userService.getUserCatagory();
    }


    @PostMapping(value = "/login", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public @ResponseBody
    ResponseEntity<String> login(@RequestParam("email") String email, @RequestParam("password") String password) {
        return new ResponseEntity<>("Created", HttpStatus.OK);
    }
}
