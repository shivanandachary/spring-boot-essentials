package com.spring.boot.aws.app.springbootawsapp.service;

import java.text.Format.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.spring.boot.aws.app.springbootawsapp.model.Employee;
import com.spring.boot.aws.app.springbootawsapp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static List<Employee> loadDefaultEmployees() {
		List<Employee> defaultEmployee= new ArrayList<>();
		defaultEmployee.add(new Employee("Shivananda","Arroju","Seniro Lead Engineer",45000d));
		defaultEmployee.add(new Employee("Naresh","Kurapati","PowerBI Developer",55000d));
		defaultEmployee.add(new Employee("Chandu","Kurapati","Typist",35000d));
		defaultEmployee.add(new Employee("Srikanth","Burra","Senior java Developer",120000d));
		defaultEmployee.add(new Employee("Sai Damodar","Peteti","Junior java Developer",54000d));
		
		return defaultEmployee;
	}
	
	// Retrieving Employee details
	public List<Employee> loadDefaultData(List<Employee> employees){
		return employeeRepository.saveAll(employees);
			
	}
	
	// Retrieving Employee details
	public Optional<Employee> getEmployeeById(Integer empId){
		return employeeRepository.findById(empId);
		
	}

	
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
		
	}
	
	// Storing Employee details
	public Employee saveEmployee(Employee employee){
		return employeeRepository.save(employee);		
	}	
	// Storing Employee details
	public Employee saveOrUpdateEmployee(Employee employee){
		return employeeRepository.save(employee);		
	}
	
	// Updating Employee details
	
	public Employee updateEmployee(Integer empId,Employee employee) {
		Optional<Employee> updateEmp=  employeeRepository.findById(empId);
		Employee emp = updateEmp.get();
		emp.setEmpId(empId);
		emp.setEmpFirstName(emp.getEmpFirstName());
		emp.setEmpLastName(emp.getEmpLastName());
		emp.setEmpSalary(emp.getEmpSalary());
		emp.setDepartment(emp.getDepartment());
		return employeeRepository.save(emp);
	}
	
	// Deleting Employee details
	public void deleteEmployeeById(Integer empId){
		employeeRepository.deleteById(empId);		
	}
	
	public void deleteAllEmployee(){
		employeeRepository.deleteAll();		
	}
	
	public Employee updateEmployeeByFields(Integer empId,Map<String,Object> fields){
		
		Optional<Employee> emp = employeeRepository.findById(empId);
		
		if(emp.isPresent()) {
			fields.forEach((key,value)-> {
				java.lang.reflect.Field field = ReflectionUtils.findField(Employee.class, key);
				field.setAccessible(true);
				ReflectionUtils.setField(field, emp.get(), value);
			});	
			return employeeRepository.save(emp.get());
		}else {
			return null;
		}
	}

}
