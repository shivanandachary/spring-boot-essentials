package com.mysql.demo.springbootmysqldemo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.demo.springbootmysqldemo.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

	public  Optional<Employee> findByEmpName(String empName);
}
