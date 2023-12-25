package com.spring.mongodb.demo.springbootmpongodbdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.mongodb.demo.springbootmpongodbdemo.model.Address;
import com.spring.mongodb.demo.springbootmpongodbdemo.model.Employee;
import com.spring.mongodb.demo.springbootmpongodbdemo.model.User;
import com.spring.mongodb.demo.springbootmpongodbdemo.repository.EmployeeRepo;
import com.spring.mongodb.demo.springbootmpongodbdemo.repository.MongoRepo;

@SpringBootApplication
public class SpringBootMpongodbDemoApplication implements CommandLineRunner {

	
	private final MongoRepo mongoRepo;
	
	private final EmployeeRepo employeeRepo;
	
	public SpringBootMpongodbDemoApplication(MongoRepo mongoRepo,EmployeeRepo employeeRepo) {
		this.mongoRepo=mongoRepo;
		this.employeeRepo=employeeRepo;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMpongodbDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		if(mongoRepo.findAll().isEmpty()) {
			mongoRepo.save(new User("ShivanandaChary","Arroju"));
			mongoRepo.save(new User("Nivedha Chary","Arroju"));
		}
		
		if(employeeRepo.findAll().isEmpty()) {
			//Employee(String empFirstName, String empLastName, double empSalary, Address empAddress
			//Address(String flatNumber, String roadNumber, String colonyName, String city)
			employeeRepo.save(new Employee("ShivanandaChary","Arroju",2300,new Address("3986","10","Vidyuth nagar","BHEL")));
		}
		
		for(User user : mongoRepo.findAll()) {
			System.out.println(user);			
		}
		for(Employee emp : employeeRepo.findAll()) {
			
			System.out.println(emp);
			System.out.println(emp.getEmpAddress());			
		}
	}
}
