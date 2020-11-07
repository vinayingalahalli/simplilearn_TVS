<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<%if(request.getSession(false)!=null){%>
<h2>Welcome, <%=session.getAttribute("username")%> You have logged in successfully at <%=new Date(session.getCreationTime()) %></h2>
<br/><br/>
<a href="logoff">Click Here to Logout</a>
<%}else{%>
<center><h1>Please LOGIN first</h1></center>
<%} %>
</body>
</html>