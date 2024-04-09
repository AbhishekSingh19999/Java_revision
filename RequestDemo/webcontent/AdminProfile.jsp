<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Profile Page</title>
</head>
<body>
<h1>ADMIN  PROFILE PAGE </h1>
 <h1><a href = "DisplayAll?Page=1">View All Users</a></h1>
 <form action="AdminProServ"  method ="post">
 
<input type = "text"  name= "ID"  placeholder ="Enter your  id ">
<br>
<input type = "submit"  name= "action" value ="Search"  >
<br>

<input type ="submit" name="action"  value ="delete">
<br>
<input type = "submit"  name= "action" value ="Update1"  >
<br>
 
 </form>
 
 

</body>
</html>