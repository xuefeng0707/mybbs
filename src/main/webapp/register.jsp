<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css" />
		
		<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script type="text/javascript" src="js/register.js"></script>
	</head>
	
	<body>
		<form class="regForm" action="user/register.action" method="post">
			Username: <input type="text" name="username" class="username"><span id="username_tip"></span><br>
			Password: <input type="password" name="password" class="password"><br>
			Email: <input type="text" name="email" class="email"><span id="email_tip"></span><br>
			<input type="submit" value="register">
			<!-- <button class="submit">submit!</button> -->
		</form>
	</body>
</html>