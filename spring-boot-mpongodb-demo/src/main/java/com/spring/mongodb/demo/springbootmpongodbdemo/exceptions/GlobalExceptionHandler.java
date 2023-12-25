/*
 * package com.spring.mongodb.demo.springbootmpongodbdemo.exceptions;
 * 
 * import org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.MissingServletRequestParameterException; import
 * org.springframework.web.bind.annotation.ExceptionHandler; import
 * org.springframework.web.bind.annotation.RestControllerAdvice;
 * 
 * @RestControllerAdvice public class GlobalExceptionHandler {
 * 
 * @ExceptionHandler(MissingServletRequestParameterException.class) public
 * ResponseEntity<?> handleMissingParams(MissingServletRequestParameterException
 * ex) { String name = ex.getParameterName(); System.out.println(name +
 * " parameter is missing"); return (ResponseEntity<?>)
 * ResponseEntity.badRequest(); }
 * 
 * }
 */