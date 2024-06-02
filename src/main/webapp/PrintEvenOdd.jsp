<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${msg}	
	<%
	int num = (Integer) request.getAttribute("n");
	for (int i = 1; i <= num; i++) {
		for (int j = 1; j <= i; j++) {
			out.print(j);	 
		}
		out.print("<br>");

	}
	%> 

</body>
</html>