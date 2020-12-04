package com.demo.pojo;

public class Hello {

	private String message;
	public Hello() {
		System.out.println("Hello from the empty constructor");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("Setter hello");
		this.message = message;
	}
	
	public void myCustomInit() {
		System.out.println("Hello from myCustomInit() method");
	}
	
	
	public void myCustomDestroy() {
		System.out.println("Hello from myCustomDestroy() method");
	}
	public Hello(String message) {
		super();
		this.message = message;
		System.out.println("Param constructor called................");
	}
}
