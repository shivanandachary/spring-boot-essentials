package com.spring.mongodb.demo.springbootmpongodbdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class User {

	@Id
	private String id;
	
	@Field
	private String firstName;
	
	@Field
	private String lastName;
	
	public User() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("User[id='%s',firstName='%s', lastName='%s']",id,firstName,lastName);
	}
	
	public User(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	
}
