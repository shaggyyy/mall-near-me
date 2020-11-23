<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="navigation_bar.css">
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

	<ul class="nav-bar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="ContactUs.jsp">Contact</a></li>
		<li class="right"><a href="registration.jsp">Sign Up</a></li>
	</ul>
	
	<div class="login-box">
	<h1>Login Here</h1>
	<form action="">
	<p>Username</p>
	<input type="text" name= "username" id="uname">
	<p>Password</p>
	<input type="password" name= "password" id="pass">
	<input type="submit" value="Login">
	<a href= "#s">Forgot Password</a>
	</form>
	
	</div>
	
	<div class="footer">
	<p></p>
	</div>


</body>
</html>