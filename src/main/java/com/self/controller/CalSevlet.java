package com.self.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CalSevlet")
public class CalSevlet extends HttpServlet {

		protected void service(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String name = request.getParameter("name");
			String maths = request.getParameter("maths");
			String science = request.getParameter("science");
			String english = request.getParameter("english");

			String error = "";
			boolean isTrue = true;
			System.out.println("name : " + (name == null));
			System.out.println("maths : " + maths);
			System.out.println("english : " + english);
			System.out.println("science : " + science);
			System.out.println("isTrue : " + isTrue);
			
			if (name == null || name.trim().length() == 0) {
				error += "<br>Name is not valid";
				isTrue = false;
			}
			if (maths == null || maths.trim().length() == 0) {
				error += "Maths's Mark is not valid <br>";
				isTrue = false;
			}
			if (english == null || english.trim().length() == 0) {
				error += "English's Mark is not valid <br>";
				isTrue = false;
			}
			if (science == null || science.trim().length() == 0) {
				error += "Science's Mark is not valid <br>";
				isTrue = false;
			}
			PrintWriter out = response.getWriter();
			if (isTrue == true ) {
				out.print("<html> <body>");
				out.print("name : s" + name + "s<br>");
				out.print("maths : " + maths + "<br>");
				out.print("english : " + english + "<br>");
				out.print("science : " + science + "<br>");
				Float perc = (Integer.parseInt(maths) + Integer.parseInt(english) + Integer.parseInt(science)) / 3.0f;
				out.print("perc :  + " + perc + "<br>");
				out.print("</body> </html>");
			} // if
			else {
				out.print("<html> <body>");
				out.print(error);
				out.print("</body> </html>");
			} // else
		}

	}

