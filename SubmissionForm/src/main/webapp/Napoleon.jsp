<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Napoleon</title>
</head>
<body>
<!-- 	<form action="addPlayers">
		<input type="text" name="pid" /><br />
		<input type="text" name="pname" /><br />
		<input type="text" name="pemail" /><br />
		<input type="submit" /> <br />
	</form>" -->
	<form action="details" method="post">
		Enter Id: <input type="text" name="pid" /><br />
		Enter Name: <input type="text" name="pname" /><br />
		Enter Email: <input type="email" name="pemail" /><br />
		<input type="submit" value="Submit" />
	</form>
</body>
</html>