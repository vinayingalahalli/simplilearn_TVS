package com.model;

public class User {

	private int userId;
	private String fname;
	private String lname;
	private int age;
	private String city;
	private String email;
	private long contact;
	private String qualification;
	private double marks;
	private int yop;
	private String univeristy;
	private float yoe;
	private String company;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	public String getUniveristy() {
		return univeristy;
	}

	public void setUniveristy(String univeristy) {
		this.univeristy = univeristy;
	}

	public float getYoe() {
		return yoe;
	}

	public void setYoe(float yoe) {
		this.yoe = yoe;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "User [userId=" + this.hashCode() + ", First Name=" + fname + ", Last Name=" + lname + ", age=" + age + ", city=" + city
				+ ", email=" + email + ", contact=" + contact + ", Highest Qualification=" + qualification + ", Marks Secured=" + marks
				+ ", Year of Passing=" + yop + ", University/College Name=" + univeristy + ", Years of Experience=" + yoe + ", Last Company Worked=" + company + "]";
	}
	
	
}
