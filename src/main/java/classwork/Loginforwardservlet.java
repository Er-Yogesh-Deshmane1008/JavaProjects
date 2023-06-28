package classwork;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginforwardservlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("servlet 2");
		resp.getWriter().println("Welcome to servalet!");
		String un = req.getParameter("username");
		
		PrintWriter writer = resp.getWriter();
		writer.print(un);
	}
	
	
}
