package com.springboot.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/*Create a REST API having user management features: 
1) These APIs should be secured by spring security with auth token, this token can be obtained by proper valid username password authentication. 
2) The application should have 2 types of users admin and user, as per user type they should have authorization rights. 
3) Create separate API that will achieve all CRUD operations with MySQL database. Use any dummy data for the same. 
4) Admin can create, delete and update user details. 
5) Normal user can only see the user details. 
6) Create design document and API documentation for the same
*/

@SpringBootApplication								// @ComponentScan + @EnableAutoConfiguration + @Configuration.
public class SB_RestApi_Application {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
	
	public static void main(String[] args) {		// Main Method
		SpringApplication.run(SB_RestApi_Application.class, args);
		
		System.out.println("Welcome to in Programming_World");
	}
}