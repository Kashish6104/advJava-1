package com.self.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InputValidationServlet")

public class InputValidationServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");

		
		boolean IsError = false;
		
		if(firstname == null || firstname.trim().length() == 0) {
			IsError = true;
			request.setAttribute("firstnameError", "Plz Enter FirstName");
		}else {
			request.setAttribute("firstnameValue", firstname);
		}
		
		if(email == null || email.trim().length() == 0) {
			IsError = true;
			request.setAttribute("emailError", "Plz Enter Email");
		}else {
			request.setAttribute("emailValue", email);
		}
		
		if(password == null || password.trim().length() == 0) {
			IsError = true;
			request.setAttribute("passwordError", "Plz Enter Password");
		}else {
			request.setAttribute("passwordValue", password);
		}
		
		if(gender == null) {
			IsError = true;
			request.setAttribute("genderError", "Plz Select Gender");
		}else {
			request.setAttribute("genderValue", gender);
		}
		
		if (city.equals("-1")) {
			IsError = true;
			request.setAttribute("cityError", "Please Select City");
		}else {
			request.setAttribute("cityValue", city);
		}
		
		RequestDispatcher rd = null;
		if(IsError == true){
			rd =  request.getRequestDispatcher("InputValidation.jsp");
			rd.forward(request, response);
		}else {
			rd =  request.getRequestDispatcher("PrintInputValidation.jsp");
			rd.forward(request, response);
		}
		
	}
}
