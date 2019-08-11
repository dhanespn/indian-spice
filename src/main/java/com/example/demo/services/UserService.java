package com.example.demo.services;

import com.example.demo.entities.UserCatagory;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repositories.UserCatagoryRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserCatagoryRepository userCatagoryRepository;


    public Iterable<UserCatagory> getUserCatagory(){
        return userCatagoryRepository.findAll();
    }


}
