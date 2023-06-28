package com.tap.sendredirect;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
//		req.getRequestDispatcher("servlet3").forward(req, resp);
		resp.sendRedirect("https://www.google.com");
		System.out.println(req.getParameter("name"));
	}

}
