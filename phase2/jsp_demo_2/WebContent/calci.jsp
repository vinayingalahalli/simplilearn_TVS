<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page Demo</title>
</head>
<body>
<form action="">
Enter x : <input type="text" name="x"/><br/><br/>
Enter y : <input type="text" name="y"/><br/><br/>
<input type="submit" value="Divide" name="click">
</form>

<%if(request.getParameter("click")!=null){
	int x=Integer.parseInt(request.getParameter("x"));
	int y=Integer.parseInt(request.getParameter("y"));
	if(y==0){
		throw new ArithmeticException("You cannot divide by zero");
	}
	out.print("Result is : "+(x/y));
}

%>
</body>
</html>