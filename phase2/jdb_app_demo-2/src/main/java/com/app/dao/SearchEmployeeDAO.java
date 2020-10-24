package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dbutil.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Employee;

public class SearchEmployeeDAO {

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
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return employee;
	}
	
	
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
	
public List<Employee> getEmployeesBySalaryRange(int min,int max) throws BusinessException {
		
		List<Employee> empList=new ArrayList<>();
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "select id,name,salary,contact,age from employee where salary between ? and ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, min);
			preparedStatement.setInt(2, max);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age"),
						resultSet.getDouble("salary"), resultSet.getLong("contact"));
				empList.add(employee);
			}
			
			if(empList.size()==0) {
				throw new BusinessException("No Emloyees found within the salary range of "+min+"-"+max);
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return empList;
	}
	
}
