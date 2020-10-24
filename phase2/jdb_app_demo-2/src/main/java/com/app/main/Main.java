package com.app.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.app.dao.EmployeeDAO;
import com.app.dao.SearchEmployeeDAO;
import com.app.exception.BusinessException;
import com.app.model.Employee;

public class Main {

	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAO();
//		Employee emp=new Employee(105, "Nagammal", 26, 123455.66, 9123456789L);
//		try {
//			int c=dao.createEmployee(emp);
//			if(c>0) {
//				System.out.println("Employee registered successfullyy");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}

//		List<Employee> empList = Arrays.asList(new Employee(108, "Ramesh", 33, 123122.22, 4123456789L),
//				new Employee(109, "Suresh", 40, 123166.22, 2123456789L),
//				new Employee(110, "Kamlesh", 40, 123166.22, 9123456789L)
//				);
//		try {
//		int c=dao.createMultipleEmployees(empList);
//		if(c>0) {
//			System.out.println("Employees registered successfullyy");
//		}
//	} catch (BusinessException e) {
//		System.out.println(e.getMessage());
//	}
		
		SearchEmployeeDAO s=new SearchEmployeeDAO();
		try {
			Employee emp=s.getEmployeeById(109);
			if(emp!=null) {
				System.out.println("Employee found with below details");
				System.out.println(emp);
			}
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			int age =40;
			List<Employee> empList=s.getEmployeesByAge(age);
			if(empList.size()>0) {
				System.out.println("\nWe found total "+empList.size()+" no of employees with age "+age+" Details are :");
				for(Employee e:empList) {
					System.out.println(e);
				}
			}
		} catch (BusinessException e) {
			System.out.println("\n"+e.getMessage());
		}
		try {
			int min =20000;
			int max = 60000;
			List<Employee> empList=s.getEmployeesBySalaryRange(min, max);
			if(empList.size()>0) {
				System.out.println("\nWe found total "+empList.size()+" no of employees with salary range "+min+"-"+max+" Details are :");
				for(Employee e:empList) {
					System.out.println(e);
				}
			}
		} catch (BusinessException e) {
			System.out.println("\n"+e.getMessage());
		}

	}

}
