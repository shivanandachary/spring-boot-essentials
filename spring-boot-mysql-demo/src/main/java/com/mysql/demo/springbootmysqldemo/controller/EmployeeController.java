package com.mysql.demo.springbootmysqldemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.demo.springbootmysqldemo.model.Employee;
import com.mysql.demo.springbootmysqldemo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;

	@GetMapping("/modifierTest")
	private String getEmp() {
		return "Private method working fine in COntroller !";
	}
	
	@GetMapping("/getEmpById/{empId}")
	protected Optional<Employee> getEmployee(@PathVariable("empId") Integer employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee emp) {
		System.out.println("Emp name is :"+ emp.getEmpName());
		return employeeService.createEmplyee(emp);
	}
	@GetMapping("/getEmpByName/{empName}")
	Optional<Employee> getEmployeeById(@PathVariable String empName) {
		return employeeService.getEmployeeByName(empName);
		
	}
	
	
}
