package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.dbutil.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Employee;

//DAO - Data Access Object
//Any class which is interacting with the DB we call such classes as DAO classes
//Here you should and must only write the code which is related to DB and DB only
public class EmployeeDAO {

	public int createEmployee(Employee employee) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "insert into employee(id,name,age,salary,contact) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setInt(3, employee.getAge());
			preparedStatement.setDouble(4, employee.getSalary());
			preparedStatement.setLong(5, employee.getContact());

			c = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");
		}
		return c;
	}

	public int updateEmployeeContact(int id, long newContact) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "";// write update query here
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// replace question marks by data here

			c = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return c;
	}

	public int deleteEmployeeById(int id) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "";// write delete query here
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			// replace question mark by data here

			c = preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");

		}
		return c;
	}

	public int createMultipleEmployees(List<Employee> empList) throws BusinessException {
		int c = 0;
		try (Connection connection = MySqlConnection.getConnection()) {
			String sql = "insert into employee(id,name,age,salary,contact) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (Employee employee : empList) {
				preparedStatement.setInt(1, employee.getId());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setInt(3, employee.getAge());
				preparedStatement.setDouble(4, employee.getSalary());
				preparedStatement.setLong(5, employee.getContact());
				preparedStatement.addBatch();
			}
			c = preparedStatement.executeBatch().length;

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");
		}
		return c;
	}

	public int createMultipleEmployeesTransaction(List<Employee> empList) throws BusinessException {
		int c = 0;
		Connection connection = null;
		try {
			connection = MySqlConnection.getConnection();
			connection.setAutoCommit(false);
			String sql = "insert into employee(id,name,age,salary,contact) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			for (Employee employee : empList) {
				preparedStatement.setInt(1, employee.getId());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setInt(3, employee.getAge());
				preparedStatement.setDouble(4, employee.getSalary());
				preparedStatement.setLong(5, employee.getContact());
				preparedStatement.addBatch();
			}
			c = preparedStatement.executeBatch().length;
			connection.commit();
		} catch (ClassNotFoundException | SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				System.out.println(e1);
			}
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMMIN");
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		return c;
	}
}
