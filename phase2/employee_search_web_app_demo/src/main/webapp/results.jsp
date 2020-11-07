<%@page import="com.employee.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="tvs" uri="WEB-INF/employeesTags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results Page</title>
</head>
<body>
<%
List<Employee> employeesList=(List<Employee>)session.getAttribute("employeesList");
%>
<div align="center">
<h2><u>Employee Search Results...............</u></h2>
<tvs:results employeesList="<%=employeesList %>"/>
</div>
</body>
</html>