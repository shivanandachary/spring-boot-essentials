package com.spring.mongodb.demo.springbootmpongodbdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mongodb.demo.springbootmpongodbdemo.model.Employee;
import com.spring.mongodb.demo.springbootmpongodbdemo.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;

	/*
	 * public Optional<Employee> findByEmpFirstName(String empFirstName) { return
	 * empRepo.findByEmpFirstName(empFirstName); }
	 */

	public Optional<Employee> findById(String id) {
		return empRepo.findById(id);
	}

	public Employee saveEmployee(Employee emp){
		Employee  savedEmp = empRepo.save(emp);
		return savedEmp;		
	}
	
	public List<Employee> findAll(){
		return empRepo.findAll();	
	}
	

}
