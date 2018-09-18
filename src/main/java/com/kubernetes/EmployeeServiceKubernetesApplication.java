package com.kubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kubernetes.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeServiceKubernetesApplication {
	@Autowired
	EmployeeRepository repository;

	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceKubernetesApplication.class, args);
	}

	
	//Swagger
	//http://10.51.58.238:9090/v2/api-docs
}
