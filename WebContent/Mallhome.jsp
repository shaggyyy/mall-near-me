<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
<table border = 1>
<tr><td>Mall Id</td><td>Mall Name</td><td>Location</td><td>Visit</td></tr>
<c:forEach items="${Mall}" var="item">
<tr><td>${item.getMallId()}</td><td>${item.getMallName()}</td><td>${item.getLocality()}</td><td><input type="button" value="visit"></td></tr>
<br>
</c:forEach>
</table>
</form>
</body>
</html>