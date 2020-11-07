package com.employee.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.exception.BusinessException;
import com.employee.model.Employee;
import com.employee.service.EmployeeSearchService;
import com.employee.service.impl.EmployeeSearchServiceImpl;

/**
 * Servlet implementation class EmployeeSearchController
 */
public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeSearchController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int criteria = Integer.parseInt(request.getParameter("criteria"));
		String value = request.getParameter("value");
		EmployeeSearchService service=new EmployeeSearchServiceImpl();
		switch (criteria) {
		case 1:// By Id
			try {
				int id=Integer.parseInt(value);
				Employee employee=service.getEmployeeById(id);
				HttpSession session=request.getSession();
				List<Employee> employeesList=Arrays.asList(employee);
				session.setAttribute("employeesList", employeesList);
				response.sendRedirect("results.jsp");
			}catch(NumberFormatException | BusinessException e) {
				if(e instanceof NumberFormatException) {
					request.setAttribute("error", "Id Cannot have any Characters or Empty");
				}else {
					request.setAttribute("error", e.getMessage());
				}
				request.getRequestDispatcher("search.jsp").forward(request, response);
			}
			break;

		case 2:// By Name

			break;
		case 3:// By Age
			try {
				int age=Integer.parseInt(value);
				List<Employee> employeesList=service.getEmployeesByAge(age);
				HttpSession session=request.getSession();
				session.setAttribute("employeesList", employeesList);
				response.sendRedirect("results.jsp");
			}catch(NumberFormatException | BusinessException e) {
				if(e instanceof NumberFormatException) {
					request.setAttribute("error", "AGE Cannot have any Characters or Empty");
				}else {
					request.setAttribute("error", e.getMessage());
				}
				request.getRequestDispatcher("search.jsp").forward(request, response);
			}
			break;
		case 4:// By Contact Number

			break;
		case 5:// By Salary

			break;
		}
	}

}
