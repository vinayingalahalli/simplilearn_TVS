package com.app.main;

import java.util.Arrays;
import java.util.List;

import com.app.dao.EmployeeDAO;
import com.app.exception.BusinessException;
import com.app.model.Employee;

public class TransactionMain {
public static void main(String[] args) {
	EmployeeDAO dao = new EmployeeDAO();

	List<Employee> empList = Arrays.asList(new Employee(112, "Ramya", 34, 123172.22, 4423456789L),
			new Employee(113, "Supriya", 40, 123166.22, 2193456789L),
			new Employee(111, "Kamla", 33, 123166.22, 9823456789L)
			);
	try {
	int c=dao.createMultipleEmployeesTransaction(empList);
	if(c>0) {
		System.out.println("Employees registered successfullyy");
	}
} catch (BusinessException e) {
	System.out.println(e.getMessage());
}
}
}
