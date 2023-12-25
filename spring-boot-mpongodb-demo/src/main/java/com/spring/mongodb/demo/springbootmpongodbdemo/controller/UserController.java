package com.spring.mongodb.demo.springbootmpongodbdemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongodb.demo.springbootmpongodbdemo.model.User;
import com.spring.mongodb.demo.springbootmpongodbdemo.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/user/{firstName}")
	public Optional<User> getUserByName(@PathVariable String firstName){
		return userService.getUserByFirstName(firstName);
		
	}
	
	
}
