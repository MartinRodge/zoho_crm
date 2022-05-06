<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>results</title>
</head>
<body>
<a href="view">Create New Lead</a>
<table>
  <tr>
      <th>Id</th>
      <th>First Name</th>
      <th>Last name</th>
      <th>Email</th>
      <th>Lead Source</th>
      <th>Mobile</th>      
</tr>
<c:forEach items="${leads}" var="any">
<tr>
     <td>${any.id}</td>
     <td><a href= "getLeadById?id=${any.id}">${any.firstName}</a></td>
     <td>${any.lastName }</td>
     <td>${any.email }</td>
     <td>${any.leadSource }</td>
     <td>${any.mobile }</td>
     
     
</tr>

</c:forEach>
</table>
</body>
</html>