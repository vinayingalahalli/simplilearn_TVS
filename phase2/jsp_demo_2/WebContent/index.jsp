<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Demo</title>
</head>
<body>
<%int x=100; %>
Without Declaration value of x =<input type="text" value="<%=x++ %>"/><br/><br/>


<%!int y=100; %>
With Declaration TAG value of y =<input type="text" value="<%=y++ %>"/><br/><br/>

<%for(int i=0;i<10;i++){
	%>
<%="i = "+i %><br/>
<%} %>

<%="Current System Date and Time is "+new Date() %>
</body>
</html>