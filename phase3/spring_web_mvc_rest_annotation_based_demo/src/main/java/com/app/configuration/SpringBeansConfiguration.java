package com.app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.app")
public class SpringBeansConfiguration {
/*
 * any Beans which you want to add like JDBC, Hibernate, logging, AOP etc
 * you can add it here using @Bean annotation above a method
 */
}
