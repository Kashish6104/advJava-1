package com.self.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalcPercServlet")
public class CalcPercServlet extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String mathsStr = request.getParameter("maths");
		String scienceStr = request.getParameter("science");
		String engStr = request.getParameter("english");
		
		String alphaRegEx = "[a-zA-z]+";
		String numRegEx = "[0-9]+";
		
		
		boolean IsError = false;
		String errormg = "";
		
		if(name == null || name.trim().length()==0) {
			IsError = true;
			errormg = "Enter Name";
		}else if(name.matches(alphaRegEx)==false) {
			IsError = true;
			errormg = "<br>Enter valid Name";
		}
		if(mathsStr == null || mathsStr.trim().length()==0) {
			IsError = true;
			errormg += "<br>Enter Marks For Maths";
		}else if(mathsStr.matches(numRegEx)== false) {
			IsError = true;
			errormg = "<br>Enter valid Marks For Maths";
		}
		if(scienceStr == null || scienceStr.trim().length()==0) {
			IsError = true;
			errormg += "<br> Enter Marks For Science";
		}else if(scienceStr.matches(numRegEx) == false) {
			IsError = true;
			errormg = "<br>Enter valid Marks For Science";
		}
		if(engStr == null || engStr.trim().length()==0) {
			IsError = true;
			errormg += "<br>Enter Marks For English";
		}else if(engStr.matches(numRegEx) == false) {
			IsError = true;
			errormg = "<br>Enter valid Marks For English";
		}
		
		if(IsError == true){
			response.setContentType("text/html");
			out.print("<html><body>");
			out.println("Solve the Following Errors:<br><br>");
			out.print(errormg);
			out.print("</body></html>");
		}else {
			Integer maths = Integer.parseInt(mathsStr);
			Integer sci = Integer.parseInt(scienceStr);
			Integer eng = Integer.parseInt(engStr);

			Float perc = (maths + sci + eng) / 3.0f;
			out.print("<HTML><body>");
			out.print("<br>Name : "+name);
			out.print("<br>Maths : "+mathsStr);
			out.print("<br>Science : "+scienceStr);
			out.print("<br>English : "+engStr);
			out.print("<br>Percentage : "+perc);
			out.print("</body></HTML>");
		}
	}

}
