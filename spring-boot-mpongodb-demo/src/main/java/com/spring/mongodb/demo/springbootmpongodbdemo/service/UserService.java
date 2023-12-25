package com.spring.mongodb.demo.springbootmpongodbdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mongodb.demo.springbootmpongodbdemo.model.User;
import com.spring.mongodb.demo.springbootmpongodbdemo.repository.MongoRepo;

@Service
public class UserService {

	@Autowired
	private MongoRepo mongoRepo;
	
	/*
	 * public Optional<User> getUserById(String firstName) { return
	 * mongoRepo.findById(firstName); }
	 */
	
	public Optional<User> getUserByFirstName(String firstName) {
		return mongoRepo.findByFirstName(firstName);
	}
}
