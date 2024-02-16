<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table cellPadding="20px" border="1">
		<th>id</th>
		<th>name</th>
		<th>cost</th>
		<th>catagory</th>
		<th>quantity</th>

		<c:forEach var="product" items="${allproducts}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.cost}</td>
				<td>${product.catagory}</td>
				<td>${product.quantity}</td>
			</tr>
		</c:forEach>
 


	</table>




</body>
</html>