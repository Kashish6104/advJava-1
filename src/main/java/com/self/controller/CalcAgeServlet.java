package com.self.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/CalcAgeServlet")
public class CalcAgeServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String firstname = request.getParameter("firstname");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		
		
boolean IsError = false;
		
		if(firstname == null || firstname.trim().length() == 0) {
			IsError = true;
			request.setAttribute("firstnameError", "Plz Enter FirstName");
		}else {
			request.setAttribute("firstnameValue", firstname);
		}
		
		if(age == null || age.trim().length() == 0) {
			IsError = true;
			request.setAttribute("ageError", "Plz Enter Age");
		}else {
			request.setAttribute("ageValue", age);
		}
		
		if(gender == null) {
			IsError = true;
			request.setAttribute("genderError", "Plz Select Gender");
		}else {
			request.setAttribute("genderValue", gender);
		}
		RequestDispatcher rd = null;
		if(IsError == true){
			rd =  request.getRequestDispatcher("Calcage.jsp");
			rd.forward(request, response);
		}else {
			rd =  request.getRequestDispatcher("CalcAgePrint.jsp");
			rd.forward(request, response);
		}
		
	}
	
	
	
	
	
}
