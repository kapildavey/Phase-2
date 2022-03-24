package com.Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.database.dataBase;

@WebServlet("/FlightList")
public class FlightList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String from=request.getParameter("fromf");
		String to=request.getParameter("tof");
		String departure=request.getParameter("departure");
		
			dataBase dao;
			try {
				dao = new dataBase();
				List<String[]>flights = dao.getAvailableFlights(from, to, departure);
				HttpSession session=request.getSession();
				session.setAttribute("airfly",flights);
				response.sendRedirect("FlightList.jsp");
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}

