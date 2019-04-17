<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw</title>
</head>
<body>
<form action="../account/withdraw" method="post">
Enter Withdraw Amount:
<input type="number" name="amount" required>
<br><br>
<input type="submit" value="Withdraw">
</form>

</body>
</html>