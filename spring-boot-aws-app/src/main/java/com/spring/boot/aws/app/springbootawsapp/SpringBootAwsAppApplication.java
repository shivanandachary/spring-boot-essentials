package com.spring.boot.aws.app.springbootawsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/aws")
public class SpringBootAwsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsAppApplication.class, args);
	}
	
	@GetMapping("/greet/{name}")
	public String getMessage(@PathVariable String name) {
		return "Hello "+ name +" !, We deoplyed our application to AWS !!";
		
	}

}
