<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="navigation_bar.css">
<link rel="stylesheet" type="text/css" href="ContactForm.css">
</head>
<body>
	<ul class="nav-bar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="ContactUs.jsp">Contact</a></li>
		<li class="right"><a href="registration.jsp">Sign Up</a></li>
		<li class="right"><a href="login.jsp">Log In</a></li>
	</ul>

	<div class="ContactUs">
		<h1>Contact Form</h1>
		<form method="post" action="ContactUs.spring">
		<p>We Will Contact You In 24 Hours!</p>
		<br>
			<p>Name</p>
			<input type="text" name="uname" id="uname" >
			<p>Email</p>
			<input type="text" name="email" id="email">
			<p>Contact Number</p>
			<input type="text" name="contact" id="contact">
			<p>Your Message </p>
			<textarea rows="10" cols="30" name="message" id="message"></textarea>
			<input type="submit" value="Submit">	
		</form>

	</div>
	<div class="footer">
		<p></p>
	</div>

</body>
</html>