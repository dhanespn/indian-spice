package com.example.demo.repositories;

import com.example.demo.entities.UserDetails;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {

	UserDetails save(UserDetails user);
	
	
	List<UserDetails> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
