package com.demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.demo.service.ValiationService;

class ValidationServiceImplTest {

	private static ValiationService service;
	@BeforeAll
	public static void createValidationService() {
		service=new ValidationServiceImpl();
	}
	
	@Test
	public void testIsValidPrimeNumberTrue() {
		assertEquals(true, service.isValidPrimeNumber(3));
	}
	@Test
	public void testIsValidPrimeNumberFalse() {
		assertEquals(false, service.isValidPrimeNumber(6));
	}
	
	@Test
	public void testIsValidPrimeNumberForNegative() {
		assertEquals(false, service.isValidPrimeNumber(-13));
	}

	@Test
	public void testIsValidPanNumberTrue() {
		assertTrue(service.isValidPanNumber("ABCDE1234A"));
	}
	@Test
	public void testIsValidPanNumberFalse() {
		assertFalse(service.isValidPanNumber("ABCDE12349999"));
	}
	
	@Test
	public void testIsValidPanNumberNull() {
		assertFalse(service.isValidPanNumber(null));
	}
}
