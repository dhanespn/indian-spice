package com.example.demo.services;

import com.example.demo.entities.UserCatagory;
import com.example.demo.entities.UserDetails;

import com.example.demo.repositories.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDetailsRepository userDetailsRepository;


    public long insertUser(UserDetails user){
        UserCatagory userCatagory = new UserCatagory();
        userCatagory.setUserCatId(2);
        userCatagory.setUserCatName("CUSTOMER");
        user.setUserCatId(userCatagory);
    	UserDetails createdUser = userDetailsRepository.save(user);
    	return createdUser.getUserId();
    }

    public String checkAuth(String email, String password) {
        List<UserDetails> userDetailsList = userDetailsRepository.findByEmailAndPassword(email,password);
        return userDetailsList.get(0).getFirstName() + userDetailsList.get(0).getLastName() ;
    }
}
