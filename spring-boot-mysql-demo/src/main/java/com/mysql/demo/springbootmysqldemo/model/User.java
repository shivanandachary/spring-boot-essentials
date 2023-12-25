package com.mysql.demo.springbootmysqldemo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_TB")
public class User {

	@Id
	@Column(name="ID")
	int id;
	@Column(name="NAME")
	String name;
	@Column(name="PASSWORD")
	String password;
	
	public User() {}
	
	public User(int id, String name, String password) {
		this.id=id;
		this.name=name;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
