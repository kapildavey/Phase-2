package com.Servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminLogin")
public class AdminLogi extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if
		("shubham.sk.kumar007@gmail.com".equalsIgnoreCase(email) && "skvp0702".equalsIgnoreCase(password)) {
			response.sendRedirect("AdminHome.jsp");
		}
		else {
			HttpSession session=request.getSession();
			session.setAttribute("message", "Invalid Details");
			response.sendRedirect("AdminPage.jsp");
		}
		
	}

}
