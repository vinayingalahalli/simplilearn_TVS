package com.demo.pojo;

public class HiScope {

	private String message;
	
	public HiScope() {
		System.out.println("HiScope() empty/default constructor called");
	}
	public HiScope(String message) {
		super();
		this.message = message;
		System.out.println("HiScope(message) constructor called");
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
