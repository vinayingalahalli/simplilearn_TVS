package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbcDemo {

	public static void main(String[] args) {
		
		Connection connection=null;
		try {
			//Step - 1) Load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded successfully");
			
			//Step - 2) Open Connection(url,username,password)
			String url="jdbc:mysql://localhost:3306/tvs";
			String username="root";
			String password="root";
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection established successfully");
			
			//Step - 3)Create Statement
			String sql="select id,name,age,salary,contact from employee";
			Statement statement=connection.createStatement();
			System.out.println("Statement Created");
			
			//Step - 4)Execute Query
			ResultSet resultSet=statement.executeQuery(sql);
			System.out.println("Query Executed successfully");
			
			//Step - 5)Process Results
			while(resultSet.next()) {
				System.out.print("Id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.print(" Salary : "+resultSet.getDouble("salary"));
				System.out.println(" Contact No : "+resultSet.getLong("contact"));
			}
			System.out.println("Results Processed successfully");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//Step - 6) Close / Release the Connection 
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				System.out.println(e);
			}
		}

	}

}
