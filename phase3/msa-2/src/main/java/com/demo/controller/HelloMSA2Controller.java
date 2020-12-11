package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMSA2Controller {

	@GetMapping("/")
	public String sayHello() {
		return "Hello from MSA-2";
	}
}
