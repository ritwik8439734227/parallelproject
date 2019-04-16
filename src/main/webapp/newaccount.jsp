<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<body>

<h1>New Account</h1>
<br>
<br>
<form action="../account/createAccount" method="post">
<h2>Account holder's Name</h2>
<input type="text" name="name" required autofocus>
<br>

<h2>Contact number</h2>
<input type="number"name="contact">
<br>
<br>
<h2>Balance</h2>
<input type="number"name="balance">
<br>
<br>
<h2>Username</h2>
<input type="text" name="username">
<br>
<br>
<h2>Password</h2>
<input type="password" name="password">

<input type="submit"value="submit">
<br>
</form>



</body>
</html>