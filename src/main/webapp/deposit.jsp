<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Money</title>
</head>
<body>
<form action="../account/deposit" method="post">
Enter account id:
<input type="number" name="id" required autofocus>
<br><br>
Enter Deposit Amount:
<input type="number" name="balance" required>
<br><br>
<input type="submit" value="Deposit">
</form>

</body>
</html>