<%@page import="ServPackage.UserRegisterDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Final Update Records</title>
</head>
<body>

  <jsp:useBean id="user" class="ServPackage.RegisterBeanClass"/>
  <jsp:setProperty property="*" name="user"/>
  
  <%
  
      UserRegisterDao dao=new  UserRegisterDao();
    int status= dao.Update(user);
    out.print(user.getId());
    out.print(user.getUsername());
       if(status==1)
       {
   %>   	
      <h1>record updated</h1>
  <% 
       }
       else
       {
   %>   	 
         <h1>record failed to update </h1>
 <%     
       }
  %>
  
</body>
</html>