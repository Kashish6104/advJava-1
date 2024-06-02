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
        String firstName = (String) request.getAttribute("firstnameValue");
        String ageStr = (String) request.getAttribute("ageValue");
        Integer age = Integer.parseInt(ageStr);
        String gender = (String) request.getAttribute("genderValue");
        boolean Isage = false;
        if ((gender.equals("male") && age >= 18) || (gender.equals("female") && age >= 21)) {
            Isage = true;
        }
    %>
</body>
	
	
	
	<% if (Isage) { %>
	<div><h2>Eligible!</h2></div>
		<% } else { %>
	<div><h2>Not Eligible</h2></div>
	<% } %>
	
	
	
	
</body>
</html>