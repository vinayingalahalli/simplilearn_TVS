package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloZuulProxyServerController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello from Zuul Proxy API Gateway";
	}
}
