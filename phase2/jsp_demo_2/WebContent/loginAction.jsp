<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action & Include Demo</title>
</head>
<body>
<h3>Action Include and Directive Include Demo</h3>

<form action="">
Enter Username <input type="text" name="userName"><br/>
Select User Role <select name="role">
<option value="Trainer">Trainer</option>
<option value="Trainee">Trainee</option>
<option value="Manager">Manager</option>
</select> <br/>
<input type="submit" name="click" value="Login">
</form>

<%if(request.getParameter("click")!=null){
	String role=request.getParameter("role");
	if(role.equals("Trainer")){%>
		<jsp:include page="trainerMenu.jsp"></jsp:include>
	<% }else if(role.equals("Manager")){%>
		<jsp:include page="managerMenu.jsp"></jsp:include>
	<%}else if(role.equals("Trainee")){%>
	<jsp:include page="traineeMenu.jsp"></jsp:include>
<%} else{
	out.print("Sorry you are other USER");
}
}

%>

<%@include file="footer.html" %>
</body>
</html>