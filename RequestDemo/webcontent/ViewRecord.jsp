<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Records</title>
</head>
<body>
<h1><%=request.getAttribute("ID") %></h1>
<h1><%=request.getAttribute("Password") %></h1>
<h1><%=request.getAttribute("Username") %></h1>
<h1><%=request.getAttribute("Email") %></h1>
<h1><%=request.getAttribute("Age") %></h1>

</body>
</html>