<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<h3><u>Register User Page</u></h3>
<form action="" method="post">
Enter Full Name <input type="text" name="fullname"><br/>
Enter Age <input type="text" name="age"><br/>
Gender <input type="radio" name="gender" value="Female"/>F &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
        <input type="radio" name="gender" value="Male"/>M <br/>
Enter Contact <input type="number" name="contact"> <br/>
Select Country <select name="country">
				<option value="INDIA">India</option>
				<option value="OTHER COUNTRY">Other</option>
			</select><br/>
Select Hobbies<br/>
&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="Sing" name="hobby">Singing<br/>
&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="Dance" name="hobby">Dancing<br/>
&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="Cook" name="hobby">Cooking<br/>
&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="Shop" name="hobby">Shopping<br/>
&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="Game" name="hobby">Gaming<br/>
&nbsp;&nbsp;&nbsp;&nbsp; <input type="checkbox" value="Other Hobby Too" name="hobby">Others<br/>
Enter Email <input type="email" name="email"><br/>
Address<textarea rows="6" cols="12" name="address"></textarea>
        <br/>
<input type="submit" value="Register" name="click">
</form>
<%if(request.getParameter("click")!=null){%>
	
	<%-- <jsp:useBean id="user" class="com.model.User" scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="user"/>
	<jsp:forward page="register"></jsp:forward> --%>
	
	 <jsp:useBean id="user" class="com.model.User" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="user"/>
<%
//Comment this below line if using request scope
response.sendRedirect("register");
}%>
</body>
</html>