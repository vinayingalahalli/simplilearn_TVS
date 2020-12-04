package com.app.dao;

import java.util.List;

import com.app.model.Employee;

public interface EmployeeDAO {

	public Employee createEmployee(Employee employee);
	public Employee updateEmployeeContact(int id, long newContact);
	public Employee	 getEmployeeById(int id);
	public void deleteEmployee(int id);
	public List<Employee> getAllEmployess();
	public List<Employee> getEmployessByAge(int age);
	public List<Employee> getEmployessBySalary(double salary);
}
