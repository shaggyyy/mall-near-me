<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="StyleForRegistration.css">
</head>
<body>
	<ul class="nav-bar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="ContactUs.jsp">Contact</a></li>
		<li class="right"><a href="login.jsp">Log In</a></li>
	</ul>

<div class="registration">
	<h1>Sign Up</h1>
	<form action="register.spring">
	<p>Enter Name</p>
	<input type="text" name= "name" id="name">
	<p>Enter Username</p>
	<input type="text" name= "uname" id="uname">
	<p>Enter Email</p>
	<input type="text" name= "email" id="email">
	<p>Enter Contact Number</p>
	<input type="text" name= "contact" id="contact">
	<p>Enter Password</p>
	<input type="password" name= "pass" id="pass">
	<input type="submit" value="Register">
	</form>
	
	</div>
	
	<div class="footer">
	<p></p>
	</div>

</body>
</html>