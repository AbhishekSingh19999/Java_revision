<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
<form action="RegisterServlet" method="get">

<input type = "text"  name= "ID"  placeholder ="Enter your ID">
<br>
<input type = "password"  name= "password"  placeholder ="Enter your password">
<br>
<input type = "text"  name= "Username"  placeholder ="Enter your name ">
<br>
<input type = "email"  name= "Email"  placeholder ="Enter your email id ">
<br>
<input type = "text"  name= "Age"  placeholder ="Enter your Age">
<br>

<input type ="submit" name="submit">
</form>
</body>
</html>