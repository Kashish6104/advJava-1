<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"

	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Validation</title>
</head>
<body>

	<div class="container-fluid">


		<div class="row">

			<div class="col-md-3"></div>

			<div class="col-md-6">

				<%
				String firstnameError = (String) request.getAttribute("firstnameError");
				String ageError = (String) request.getAttribute("ageError");
				String genderError = (String) request.getAttribute("genderError");
	
				
				String firstnameValue = (String)request.getAttribute("firstnameValue");
				String ageValue = (String)request.getAttribute("ageValue");
				String genderValue = (String)request.getAttribute("genderValue");
				%>

					<h2>Verify Now</h2><br>
				<form action="CalcAgeServlet" method="post"  >
					
					FirstName:<input type="text" name="firstname" value="<%=firstnameValue == null ? "" : firstnameValue%>" class="form-control">
					<span class="text-danger"><%=firstnameError == null ? "" : firstnameError%></span>
					
					<br> Age:<input type="number" name="age" value="<%=ageValue == null ? "" : ageValue%>" class="form-control">
					<span class="text-danger"><%=ageError == null ? "" : ageError%></span>
						
					<br><br> Gender : Male <input type="radio" name="gender"
						value="male" <%=genderValue!=null&&genderValue.equals("male")?"checked":"" %>/> 
						Female <input type="radio" name="gender"
						value="female" <%=genderValue!=null&&genderValue.equals("female")?"checked":"" %> />
					<span class="text-danger"><%=genderError == null ? "" : genderError%></span>
				
					<br>
					<br> <input type="submit" value="Sumit" class="btn btn-primary" >

				</form>

			</div>

			<div class="col-md-3"></div>

		</div>

	</div>

</body>
</html>