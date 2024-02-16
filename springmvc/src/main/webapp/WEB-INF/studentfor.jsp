<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
<form action="savestudent">
enter id:<input type="number" name="id">
enter name:<input type="text" name="name">
enter age:<input type="number" name="age">
<input type="submit">

</form>
</body>
</html>