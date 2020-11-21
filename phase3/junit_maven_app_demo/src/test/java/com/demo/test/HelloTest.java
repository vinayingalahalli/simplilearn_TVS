package com.demo.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloTest {
	@BeforeAll
	public static void testBeforeAll() {
		System.out.println("Hello from @BeforeAll, this will only once before the object creation of this class.");
	}
	
	@BeforeEach
	public void testBeforeEach() {
		System.out.println("Hello from @BeforeEach this method will execute before every test case of this class.");
	}
	
	
	@Test
	public void testHello1() {
		System.out.println("Hello from testHello1 @Test case");
	}
	@Test
	public void testHello2() {
		System.out.println("Hello from testHello2 @Test case");
	}
	@Test
	public void testHello3() {
		System.out.println("Hello from testHello3 @Test case");
	}
	
	@AfterEach
	public void testAfterEach() {
		System.out.println("Hello from @AfterEach this method will execute after every test case of this class.");
	}
	
	
	@AfterAll
	public static void testAfterAll() {
		System.out.println("Hello from @AfterAll, this will only once after the object destruction of this class.");
	}
}
