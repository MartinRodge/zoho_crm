<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file ="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead create</title>
</head>
<body>
<h2>Create Lead</h2>
<form action ="saveLead" method="post">
<pre>
FirstName<input type="text" name="firstName"/>
lastName<input type="text" name="lastName"/>
Email<input type="text" name="email"/>
LeadSource:
<select name="leadSource">
<option value = "tv Commercial">Tv Commercial</option>
<option value = "radio">Radio</option>
<option value ="news paper">news paper</option>
<option value = "online">online</option>
</select>
Mobile<input type="text" name="mobile"/>

<input type ="submit" value ="save"/>
</pre>
</form>


</body>
</html>