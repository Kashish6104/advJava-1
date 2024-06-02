<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String fname = (String)request.getAttribute("firstnameValue");
	String email = (String)request.getAttribute("emailValue");
	String passwd = (String)request.getAttribute("passwordValue");
	String gender = (String)request.getAttribute("genderValue");
	String city = (String)request.getAttribute("cityValue");

%>

<h2>FirstName:<%=fname %>
<h2>Email:<%=email %>
<h2>Password:<%=passwd %>
<h2>Gender:<%=gender %>
<h2>City:<%=city %>
</body>
</html>