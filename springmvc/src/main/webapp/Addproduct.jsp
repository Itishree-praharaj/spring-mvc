<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
<form:form action="saveProduct" modelAttribute="product">
Enter id : <form:input path="id"/>
Enter name : <form:input path="name"/>
Enter cost : <form:input path="cost"/>
Enter category : <form:input path="catagory"/>
Enter quantity : <form:input path="quantity"/>
<input type="submit">
</form:form>

</body>
</html>