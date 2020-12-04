package com.app.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.app.dao.EmployeeDAO;
import com.app.dao.mapper.EmployeeRowMapper;
import com.app.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate template;
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template=new JdbcTemplate(this.dataSource);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		String sql="insert into employee(id,name,age,contact,salary) values(?,?,?,?,?)";
		template.update(sql,employee.getId(),employee.getName(),employee.getAge(),employee.getContact(),employee.getSalary());
		return employee;
	}

	@Override
	public Employee updateEmployeeContact(int id, long newContact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		String sql="select id,name,age,salary,contact from employee where id=?";
		Employee employee=template.queryForObject(sql, new Object[] {id},new EmployeeRowMapper());
		return employee;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployess() {
		String sql="select id,name,age,salary,contact from employee";
		List<Employee> employeeList=template.query(sql, new EmployeeRowMapper());
		return employeeList;
	}

	@Override
	public List<Employee> getEmployessByAge(int age) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployessBySalary(double salary) {
		// TODO Auto-generated method stub
		return null;
	}

}
