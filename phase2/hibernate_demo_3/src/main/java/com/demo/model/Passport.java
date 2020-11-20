package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Passport {

	@Id
	private String passportNumber;
	private int validity;
	private long bookNumber;
	
	public Passport() {
		// TODO Auto-generated constructor stub
	}

	public Passport(String passportNumber, int validity, long bookNumber) {
		super();
		this.passportNumber = passportNumber;
		this.validity = validity;
		this.bookNumber = bookNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassPortNumber(String passPortNumber) {
		this.passportNumber = passPortNumber;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public long getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(long bookNumber) {
		this.bookNumber = bookNumber;
	}

	@Override
	public String toString() {
		return "Passport [passPortNumber=" + passportNumber + ", validity=" + validity + ", bookNumber=" + bookNumber
				+ "]";
	}
	
}
