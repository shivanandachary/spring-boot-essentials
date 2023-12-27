package com.spring.boot.aws.app.springbootawsapp.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(EmployeeNotFoundEception.class)
	public Map<String , Object> handlerEmployeeNotFoundException(EmployeeNotFoundEception ex) {		
		Map<String , Object> errorMap = new HashMap<>();		
		errorMap.put("Error Message",ex.getMessage());	
		errorMap.put("Error Code",ex.getErrorCode());	
		errorMap.put("Error Timestamp",ex.getTimestamp());
		return errorMap;		
	}
}
