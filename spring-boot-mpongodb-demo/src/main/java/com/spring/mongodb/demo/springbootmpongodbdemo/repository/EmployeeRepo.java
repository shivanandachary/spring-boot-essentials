package com.spring.mongodb.demo.springbootmpongodbdemo.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.mongodb.demo.springbootmpongodbdemo.model.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
	
//	public Optional<Employee> findByEmpFirstName(String empFirstName);

}
