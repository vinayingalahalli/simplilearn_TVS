package com.app.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e=new Employee();
		e.setId(rs.getInt("id"));
		e.setName(rs.getString("name"));
		e.setAge(rs.getInt("age"));
		e.setContact(rs.getLong("contact"));
		e.setSalary(rs.getDouble("salary"));
		return e;
	}

}
