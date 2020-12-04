package com.app.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring_jdbc_beans.xml");
		Employee e=new Employee(111, "Amar", 24, 3124567891L, 22221.22);
		
		EmployeeDAO dao=(EmployeeDAO) context.getBean("dao");
		
	//	dao.createEmployee(e);
		
		System.out.println(dao.getEmployeeById(100));
		System.out.println(dao.getEmployeeById(111));
		
		
		List<Employee> empList=dao.getAllEmployess();
		System.out.println("\n\nPrinting all employees");
		for(Employee employee:empList) {
			System.out.println(employee);
		}

	}

}
