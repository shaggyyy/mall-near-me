<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="navigation_bar.css">
</head>
<body>

	<ul class="nav-bar">
		<li><a href="Home.jsp">Home</a></li>
		<li><a href="AboutUs.jsp">About Us</a></li>
		<li><a href="ContactUs.jsp">Contact</a></li>
		<li class="right"><a href="registration.jsp">Sign Up</a></li>
		<li class="right"><a href="login.jsp">Log In</a></li>
	</ul>

	<div align="center">
	<form action="SearchMall.spring" method="get">
		<br> <br>
		<br>
		<br>
		<h1>Welcome To Mall Near Me</h1>
		<br>
		<h3>Enter The Location Of Mall</h3>
		
		<input type="text" name="locality" id="locality"> 
		<br>
		<br>
		<input type="submit" value="Search Malls">
		</form>
	</div>
	
	<div class="footer">
	<p></p>
	</div>

</body>
</html>

