package com.example.suhas.bhat.simplerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class SimplerestapiApplication {

	@RequestMapping("/")
	public String HelloWorld() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SimplerestapiApplication.class, args);
	}
}
