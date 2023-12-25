package com.spring.mongodb.demo.springbootmpongodbdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongodb.demo.springbootmpongodbdemo.model.Employee;
import com.spring.mongodb.demo.springbootmpongodbdemo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/{id}")
	public Optional<Employee> findById(@RequestParam String id){
		System.out.println("empFirstName : "+id);
		return employeeService.findById(id);
	}
	
	@GetMapping("/all")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@PostMapping("/insertEmp")
	public  Employee insertEmployeeDetails(@RequestBody Employee emp) {
		return employeeService.saveEmployee(emp);
	}

}
