package com.service.impl;

import javax.jws.WebService;

import com.service.CalculatorService;

@WebService(endpointInterface = "com.service.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String sayHello(String name) {
		return "Hello...... "+name+" Welcome to SOAP services with JAX-WS RPC style......";
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public float div(float a, float b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
