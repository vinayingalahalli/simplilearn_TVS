package com.employee.dao;

import java.util.List;

import com.employee.exception.BusinessException;
import com.employee.model.Employee;

public interface EmployeeSearchDAO {
	public Employee getEmployeeById(int id) throws BusinessException;
	public Employee getEmployeeByContactNumber(long contact) throws BusinessException;
	public List<Employee> getEmployeesByAge(int age) throws BusinessException;
	public List<Employee> getEmployeesByName(String name) throws BusinessException;
	public List<Employee> getEmployeesBySalary(double salary) throws BusinessException;
}
