package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Msa3Application {

	public static void main(String[] args) {
		SpringApplication.run(Msa3Application.class, args);
	}

}
