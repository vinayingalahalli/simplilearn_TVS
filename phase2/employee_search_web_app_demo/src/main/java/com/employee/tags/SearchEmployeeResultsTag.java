package com.employee.tags;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.employee.model.Employee;

public class SearchEmployeeResultsTag extends SimpleTagSupport {
	
	private List<Employee> employeesList;
	public void setEmployeesList(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}

	
	@Override
	public void doTag() throws IOException {
		String headers[]= {"Employee ID","Employee NAME","Employee AGE","Employee SALARY","Employee CONTACT"};
		JspWriter out=getJspContext().getOut();
		
		out.print("<table border='1px'>");
		out.print("<tr>");
		for(String header:headers) {
			out.print("<th>"+header+"</th>");
		}
		out.print("</tr>");
		for(Employee employee:employeesList) {
			out.print("<tr>");
			out.print("<td>"+employee.getId()+"</td>");
			out.print("<td>"+employee.getName()+"</td>");
			out.print("<td>"+employee.getAge()+"</td>");
			out.print("<td>"+employee.getSalary()+"</td>");
			out.print("<td>"+employee.getContact()+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		
		
	}

	
}
