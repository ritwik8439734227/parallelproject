<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers Detail</title>
</head>
<body>
<h3>customer Details</h3>
	<table border="1">
		<thead>
			<tr>
				<th>Id</th>
				<th>name</th>
				<th>contact</th>
				<th>balance</th>
				<th>username</th>
				<th>password</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="customer" items="${CUSTOMERLIST}">
				<tr>
					<td>${customer.accountId}</td>
					<td>${customer.name}</td>
					<td>${customer.contact}</td>
					<td>${customer.balance}</td>
					<td>${customer.username}</td>
					<td>${customer.password}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<h2><a href="../index.jsp"><- BACK</a></h2>
</body>
</html>