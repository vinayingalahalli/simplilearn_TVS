package com.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "trainee_tbl")
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;
	@Column(name = "traineeName",nullable = false,length = 55)
	private String name;
	@Column(unique = true)
	private long contactNumber;
	@Lob
	//@Column(columnDefinition = "CLOB")
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	
	public Trainee() {
		// TODO Auto-generated constructor stub
	}

	public Trainee(String name, long contactNumber, String address, Date dob) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
		this.dob = dob;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", name=" + name + ", contactNumber=" + contactNumber + ", address="
				+ address + ", dob=" + dob + "]";
	}
	
}
