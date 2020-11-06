<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
<h1>Hello from HTML</h1>
<%="<h1>HELLO FROM JSP</h1>" %>
<%="<h1>HELLO FROM JSP AGAIN</h1>" %>

<form action="">
Enter Your Name <input type="text" name="fname">
<input type="submit" name="click" value="CLICK">
</form>

<%if(request.getParameter("click")!=null){
	out.print("<h2>Helllooooo "+request.getParameter("fname")+ " current login time is  "+new Date()+"</h2>");
}

%>
</body>
</html>