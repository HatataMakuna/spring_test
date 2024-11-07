package com.springtest.spring_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

//	@GetMapping
//	public String hello() {
//		return "Hello World!";
//	}

	// Returns a json code with Hello and World
//	@GetMapping
//	public List<String> hello() {
//		return List.of("Hello, World");
//	}

}
