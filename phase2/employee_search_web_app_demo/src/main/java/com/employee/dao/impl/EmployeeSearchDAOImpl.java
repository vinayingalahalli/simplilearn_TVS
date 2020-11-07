package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employee.dao.EmployeeSearchDAO;
import com.employee.dbutil.MySqlConnection;
import com.employee.exception.BusinessException;
import com.employee.model.Employee;

public class EmployeeSearchDAOImpl implements EmployeeSearchDAO {

	@Override
	public Employee getEmployeeById(int id) throws BusinessException {
		Employee employee = null;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select name,age,salary,contact from employee where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				employee = new Employee(id, resultSet.getString("name"), resultSet.getInt("age"),
						resultSet.getDouble("salary"), resultSet.getLong("contact"));
			}else {
				throw new BusinessException("Entered employee id "+id+" not found");
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured kindly contact SYSADMMIN");

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
		List<Employee> empList=new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select id,name,salary,contact from employee where age=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("id"), resultSet.getString("name"), age,
						resultSet.getDouble("salary"), resultSet.getLong("contact"));
				empList.add(employee);
			}
			
			if(empList.size()==0) {
				throw new BusinessException("No Emloyees found with the age "+age);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return empList;
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
