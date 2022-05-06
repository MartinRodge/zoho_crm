<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ include file ="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body>
<table>
  <tr>
      <th>Id</th>
      <th>First Name</th>
      <th>Last name</th>
      <th>Email</th>
      <th>ProductName</th>      
      <th>Amount</th>
</tr>
<c:forEach items="${bills}" var="bill">
<tr>
     <td>${bill.id}</td>
     <td>${bill.firstName}</td>
     <td>${bill.lastName }</td>
     <td>${bill.email }</td>
	 <td>${bill.productName }</td>
	 <td>${bill.amountPaid }</td>
     
     
</tr>

</c:forEach>
</table>
</body>
</html>