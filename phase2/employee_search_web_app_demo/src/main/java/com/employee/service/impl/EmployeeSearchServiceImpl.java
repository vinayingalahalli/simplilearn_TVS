package com.employee.service.impl;

import java.util.List;

import com.employee.dao.EmployeeSearchDAO;
import com.employee.dao.impl.EmployeeSearchDAOImpl;
import com.employee.exception.BusinessException;
import com.employee.model.Employee;
import com.employee.service.EmployeeSearchService;

public class EmployeeSearchServiceImpl implements EmployeeSearchService {

	private EmployeeSearchDAO dao=new EmployeeSearchDAOImpl();
	@Override
	public Employee getEmployeeById(int id) throws BusinessException {
		Employee employee=null;
		if(id>=100 && id<1000) {
			//DAO
			employee=dao.getEmployeeById(id);
		}else {
			throw new BusinessException("Entered Id "+id+" is INVALID");
		}
		return employee;
	}

	@Override
	public Employee getEmployeeByContactNumber(long contact) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesByAge(int age) throws BusinessException {
		List<Employee> employeeList=null;
		if(age>=21 && age<=50) {
			//DAO
			employeeList=dao.getEmployeesByAge(age);
		}else {
			throw new BusinessException("Entered Age "+age +" is INVALID");
		}
		return employeeList;
	}

	@Override
	public List<Employee> getEmployeesByName(String name) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeesBySalary(double salary) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
