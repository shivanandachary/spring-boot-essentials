package com.mysql.demo.springbootmysqldemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.demo.springbootmysqldemo.model.User;
import com.mysql.demo.springbootmysqldemo.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/all")
	public List<User> users(){
		return userService.getAllUser();
	}
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user){		
		return userService.saveUser(user);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String  deleteUser(@PathVariable int id) {
		
		userService.deleteUserById(id);
		
		return "User Id : "+id +" has been deleted";
	}
	
	@GetMapping("/user/{id}")
	public  Optional<User> getUser(@PathVariable int id) {		
		return userService.getUserById(id);		
	}
	
	
	@GetMapping("/test")
	public List<String> greet(){
		List<String> l= new ArrayList<>();
		l.add("Hello !");
		l.add("Hi !");
		return l;
		
	}

}
