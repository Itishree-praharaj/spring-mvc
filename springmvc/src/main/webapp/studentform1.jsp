<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg } 
<form:form action="savestudent" modelAttribute="student">
enter id:<form:input path="id"/>
enter name:<form:input path="name"/>
enter age:<form:input path="age"/>
<input type="submit">
</form:form>
</body>
</html>