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
				String emailError = (String) request.getAttribute("emailError");
				String passwordError = (String) request.getAttribute("passwordError");
				String genderError = (String) request.getAttribute("genderError");
				String cityError = (String) request.getAttribute("cityError");
				
				String firstnameValue = (String)request.getAttribute("firstnameValue");
				String emailValue = (String)request.getAttribute("emailValue");
				String passwordValue = (String)request.getAttribute("passwordValue");
				String genderValue = (String)request.getAttribute("genderValue");
				String cityValue = (String)request.getAttribute("cityValue");
				%>

					<h2>Register Now</h2><br>
				<form action="InputValidationServlet" method="post"  >
					
					FirstName:<input type="text" name="firstname" value="<%=firstnameValue == null ? "" : firstnameValue%>" class="form-control">
					<span class="text-danger"><%=firstnameError == null ? "" : firstnameError%></span>
					
					<br> Email:<input type="email" name="email" value="<%=emailValue == null ? "" : emailValue%>" class="form-control">
					<span class="text-danger"><%=emailError == null ? "" : emailError%></span>
					
					<br><br> Password:<input type="password" autocomplete="off" name="password" value="<%=passwordValue == null ? "" : passwordValue%> class="form-control">
					<span class="text-danger"><%=passwordError == null ? "" : passwordError%></span>
					
					
					<br><br> Gender : Male <input type="radio" name="gender"
						value="male" <%=genderValue!=null&&genderValue.equals("male")?"checked":"" %>/> 
						Female <input type="radio" name="gender"
						value="female" <%=genderValue!=null&&genderValue.equals("female")?"checked":"" %> />
					<span class="text-danger"><%=genderError == null ? "" : genderError%></span>
					
					<br> <br> City : <select name="city" class="form-control">
						<option value="-1" >Select City</option>
						<option value="ahd" <%=cityValue!=null&&cityValue.equals("ahm")?"selected":"" %>>Ahmedabad</option>
						<option value="gnr" <%=cityValue!=null&&cityValue.equals("gnr")?"selected":"" %>>Gandhinagar</option>
						<option value="srt" <%=cityValue!=null&&cityValue.equals("srt")?"selected":"" %>>Surat</option>
					</select>
					
					
					
					
					<span class="text-danger"><%=cityError == null ? "" : cityError%></span>
					<br>
					<br> <input type="submit" value="Sumit" class="btn btn-primary" >

				</form>




			</div>

			<div class="col-md-3"></div>

		</div>

	</div>

</body>
</html>