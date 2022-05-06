<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead info</title>
</head>
<body>
<h2>Lead info</h2>
Id:${lead.id}<br/>
FirstName:$(lead.firstName)<br/>
LastName:${lead.lastName }<br/>
email:${lead.email }<br/>
LeadSource:${lead.leadSource}<br/>
Mobile:${lead.mobile}<br/>

<form action="compose" method="post">
  <input type="hidden" name="emailId" value="${lead.email }"/>
  <input type="submit" value="Email"/>
</form>

<form action="convertLead" method="post">
  <input type="hidden" name="id" value="${lead.id }"/>
  <input type="submit" value="Convert"/>
</form>

</body>
</html>