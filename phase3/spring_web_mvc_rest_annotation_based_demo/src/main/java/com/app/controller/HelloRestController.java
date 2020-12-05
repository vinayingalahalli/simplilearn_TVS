package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/")
	public String helloGetMapping() {
		return "Hello from Spring RESTful services from GET method";
	}
	
	@PostMapping("/")
	public String helloPostMapping() {
		return "Hello from Spring RESTful services from POST method";
	}
	
	@PutMapping("/")
	public String helloPutMapping() {
		return "Hello from Spring RESTful services from PUT method";
	}
	
	@DeleteMapping("/")
	public String helloDeleteMapping() {
		return "Hello from Spring RESTful services from DELETE method";
	}
}
