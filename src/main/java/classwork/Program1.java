package classwork;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Program1 extends HttpServlet {
  
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String un = req.getParameter("username");
		System.out.println("Name:" + un);
		
//		Enumeration<String> un = req.getParameterNames();
//		System.out.println(un.nextElement());
		
//		PrintWriter out = resp.getWriter();
//		out.print(un);
	}
	
	
	
}
