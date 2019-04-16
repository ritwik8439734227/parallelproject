<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>customer login</title>
</head>
<body>
<form action="/account/customerlogin" method="post">
UserName
<input type="text" name="user" required autofocus>
<br>
Password
<input type="password" name="password" required >
<input type="submit" value="submit">
</form>
</body>
</html>