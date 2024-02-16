<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
table cellPadding= "20px" border="1">
<th> id</th>
<th> name</th>
<th> age</th>

<C:forEach var="student" items="${allstudents}">
<tr>
<td> ${students.getId()}</td> 
<td> ${students.getName()}</td> 
<td> ${students.getAge()}</td> 
</tr>
</C:forEach>
</body>
</html>