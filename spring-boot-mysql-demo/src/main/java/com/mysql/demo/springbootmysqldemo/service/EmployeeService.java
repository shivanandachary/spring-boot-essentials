package com.mysql.demo.springbootmysqldemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysql.demo.springbootmysqldemo.model.Employee;
import com.mysql.demo.springbootmysqldemo.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo empRepo;
	
	
	public Optional<Employee> getEmployeeById(Integer employeeId) {
		return empRepo.findById(employeeId);
	}
	
	public Optional<Employee> getEmployeeByName(String empName) {
		return empRepo.findByEmpName(empName);
	}
	
	public Employee createEmplyee(Employee emp) {
		Employee employee = empRepo.save(emp);
		return employee;
		
	}
}
