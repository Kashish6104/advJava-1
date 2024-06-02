<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New JSP File</title>
</head>
<body>
<h2>ADDITION OF TWO NUMBERS:
<%
int a = 30 ;
int b = 20;
int c = a + b;
%>

<h4>NUMBER 1 = <%=a%>
<h4>NUMBER 2 = <%=b%><br><br>
<%= a %> + <%=b %> = <%=c %>
<h4>SUM =  <%=b%>
</body>
</html>