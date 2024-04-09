<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Final Update Records </title>
</head>
<body>
<form action="Update.jsp" method="get">

<input type = "text"  name= "id"  value="<%=request.getAttribute("ID")%>">
<br>
<input type = "password"  name= "password"  value = "<%=request.getAttribute("Password")%>">
<br>
<input type = "text"  name= "username"   value="<%=request.getAttribute("Username")%>">
<br>
<input type = "email"  name= "email"   value="<%=request.getAttribute("Email")%>">
<br>
<input type = "text"  name= "age"   value="<%=request.getAttribute("Age")%>">
<br>

<input type ="submit" name="submit">
</form>
</body>
</html>