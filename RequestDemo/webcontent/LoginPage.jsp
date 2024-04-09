<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page </title>
</head>
<body>

<h1>LOGIN PAGE</h1>
<form action="LoginServlet" method="post">

<input type = "text"  name= "ID"  placeholder ="Enter your  id ">
<br>
<input type = "password"  name= "password"  placeholder ="Enter your password">
<br>
<input type = "text"  name= "Username"  placeholder ="Enter your name ">
<br>
<input type ="submit" name="submit">
</form>
</body>
</html>