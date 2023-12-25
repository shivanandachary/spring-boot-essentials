package com.mysql.demo.springbootmysqldemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.demo.springbootmysqldemo.model.User;
import com.mysql.demo.springbootmysqldemo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	
	public User saveUser(User user) {
		
		User savedUser = userRepo.save(user);
		return savedUser;
		
	}
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	
	
	public void  deleteUserById(Integer id) {
		userRepo.deleteById(id);
	}
	
	public Optional<User>  getUserById(Integer id) {
		return userRepo.findById(id);
	}
}
