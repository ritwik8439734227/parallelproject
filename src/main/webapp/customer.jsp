<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer login</title>
</head>
<body>
<form action="/account/cust" method="post">
<h1>UserId</h1>
<input type="number" name="id" required autofocus>
<br>
<h1>Password</h1>
<input type="password" name="password" required >
<input type="submit" value="submit">
</form>
</body>
</html>