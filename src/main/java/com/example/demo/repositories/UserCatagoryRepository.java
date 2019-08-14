package com.example.demo.repositories;

import com.example.demo.entities.UserCatagory;
import com.example.demo.entities.UserDetails;

import org.springframework.data.repository.CrudRepository;

public interface UserCatagoryRepository extends CrudRepository<UserCatagory, Long> {

	UserDetails save(UserDetails user);

}
