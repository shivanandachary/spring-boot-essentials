package com.spring.boot.aws.app.springbootawsapp.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.aws.app.springbootawsapp.exception.EmployeeNotFoundEception;
import com.spring.boot.aws.app.springbootawsapp.model.Employee;
import com.spring.boot.aws.app.springbootawsapp.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;	
	
	@GetMapping("/employee/loadData")
	public List<Employee> getEmpInfo() {
		List<Employee> employees = EmployeeService.loadDefaultEmployees();
		return empService.loadDefaultData(employees);
		
	}
		
	@GetMapping("/test/{test}")
	public String getEmpMessage(@PathVariable String test) {
		return "Hello "+test +", Spring-boot AWS has been deployed to AWS cloud !";
		
	}

	@GetMapping("/employee/retrive/{empId}")
	public Optional<Employee> getEmployee(@PathVariable Integer empId) throws EmployeeNotFoundEception{
		Optional<Employee> emp= empService.getEmployeeById(empId);
		if(!emp.isEmpty()) {
			return emp;
		}
		else {
			throw new EmployeeNotFoundEception("Employee does not exist", "Plese provide proper employee Id", new Date());	
		}
	}
	
	@PostMapping("/employee/create/createEmployee")
	public Employee createEmployee(@RequestBody Employee employee){
		return empService.saveEmployee(employee);		
	}
	
	@GetMapping("/employee/retrive/allEmployees")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmployees();		
	}
	
	@PutMapping("/employee/update")
	public Employee updateEmployee(@RequestBody Employee employee){
		return empService.saveOrUpdateEmployee(employee);		
	}
	
	@DeleteMapping("/delete/{empId}")
	public Optional<Employee> deleteEmployeeById(@PathVariable Integer empId){
		return empService.getEmployeeById(empId);		
	}
	

	@DeleteMapping("/employee/delete/allEmployee")
	public String deleteAllEmployee(){
		empService.deleteAllEmployee();	
		return "All Employee have been delete from DB !";
	}
	
	@PatchMapping("/employee/update/{empId}")
	public Employee updateEmployeeFields(@PathVariable Integer empId,@RequestBody Map<String,Object> fields) throws EmployeeNotFoundEception{
		Employee emp = empService.updateEmployeeByFields(empId,fields);
		if(emp != null) {
			return emp;
		}
		else {
			throw new EmployeeNotFoundEception("Employee does not exist", "Plese provide proper employee Id", new Date());	
		}
	}
	
}
