package com.spring.boot.aws.app.springbootawsapp.swagger.api;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class EmployeeServiceSwaggerAPI {

	
	@Bean
	   public OpenAPI defineOpenApi() {
	       Server server = new Server();
	       server.setUrl("http://ec2-3-109-224-154.ap-south-1.compute.amazonaws.com/");
	       server.setDescription("Senior Lead Engineer");

	       Contact myContact = new Contact();
	       myContact.setName("Shivanandachary Arroju");
	       myContact.setEmail("shivananda0011@gmail.com");

	       Info information = new Info()
	               .title("Employee Management System API")
	               .version("1.0")
	               .description("This API exposes endpoints to manage employees.")
	               .contact(myContact);
	       return new OpenAPI().info(information).servers(List.of(server));
	}
}
