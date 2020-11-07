<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
	<div align="center">
		<h2>
			<u>Welcome to Employee Search App</u>
		</h2>
		<br /> <br /> <br />
		<form action="search">
			Select Search Criteria<select name="criteria">
				<option value="1">By ID</option>
				<option value="2">By Name</option>
				<option value="3">By Age</option>
				<option value="4">By Contact Number</option>
				<option value="5">By Salary</option>
			</select><br /> 
			Enter Search Value For the Criteria Selected Above
			<input type="text" name="value"><br />
			<input type="submit" value="Search">
		</form>
		<%if(request.getAttribute("error")!=null){ %>
		<span style="color:red;"><%= request.getAttribute("error")%></span>
		<%} %>
	</div>
</body>
</html>