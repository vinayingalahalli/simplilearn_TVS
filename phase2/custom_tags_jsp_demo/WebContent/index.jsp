<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="tvs" uri="WEB-INF/customTag.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Tag</title>
</head>
<body>
<h1><u>Custom Tag Demo</u></h1>
<br/>
<br/>
<h3>Simple Tag Demo</h3>
<tvs:myDate/>

<br/><br/>
<h3>Tag with Attributes Demo</h3>
<tvs:customDate format="dd.MMM.yyyy EEEEE   hh:mm:ss a z "/>

<br/><br/>
<h3>Tag with body demo</h3>
<tvs:upper option="lower">I WILL BE CONVERTED TO LOWERCASE</tvs:upper>

</body>
</html>