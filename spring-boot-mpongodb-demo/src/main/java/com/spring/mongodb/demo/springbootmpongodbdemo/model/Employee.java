package com.spring.mongodb.demo.springbootmpongodbdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Employee {

	@Id
	private String id;
	
	@Field
	private String empFirstName;
	
	@Field
	private String empLastName;
	
	@Field
	private double empSalary;	
	
	@Field
	private Address empAddress;
	
	public Employee() {}
	
	public Employee(String empFirstName, String empLastName, double empSalary, Address empAddress) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		return String.format("Address[empFirstName='%s',empLastName='%s', empSalary='%s',empAddress='%s']",empFirstName,empLastName,empSalary,empAddress);
	}	
}
