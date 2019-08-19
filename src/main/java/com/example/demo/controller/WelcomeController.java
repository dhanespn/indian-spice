package com.example.demo.controller;

import com.example.demo.entities.UserDetails;
import com.example.demo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

@Controller
//@RestController
public class WelcomeController {

    @Autowired
    UserService userService;
    
    @GetMapping("/")
    public String hi() {
    	return "register";
    }

    @PostMapping(value = "/register", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> register(@ModelAttribute("multiPartsRequestPayload") UserDetails user) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" + user.getFirstName());
        long userId = userService.insertUser(user);
        return new ResponseEntity<>(userId + "is created", HttpStatus.CREATED);
    }


    @PostMapping(value = "/login", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public @ResponseBody
    String login(@RequestParam("email") String email, @RequestParam("password") String password, HttpServletRequest request) {
        String fullName = userService.checkAuth(email, password);
        List<String> messages = (List<String>) request.getSession().getAttribute("SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("SESSION_MESSAGES", messages);
		}
		messages.add(fullName);
		request.getSession().setAttribute("SESSION_MESSAGES", messages);
		return "index.html";
    }
    
    @PostMapping("/destroy")
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "/login";
	}
}
