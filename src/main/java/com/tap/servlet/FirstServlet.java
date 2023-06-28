package com.tap.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//	   String name = req.getParameter("name");
//	   String desig = req.getParameter("desig");
//	   String ts = req.getParameter("techskills");
//	
//	   System.out.println("name =" + name);
//	   System.out.println("desig =" + desig);
//	   System.out.println("techskills=" + ts);
		
		
//		Enumeration<String> pn = req.getParameterNames();
//		  while(pn.hasMoreElements()) {
//			 System.out.println( pn.nextElement());
//       	}
		
		
		
		
		String name = req.getParameter("name");
	    String desig = req.getParameter("desig");
		String[] pv = req.getParameterValues("techskills");
		
	   System.out.println("name =" + name);
	   System.out.println("desig =" + desig);
       System.out.println("techskills:");
	   for(String i: pv) 
	   {
		   System.out.println(i);
	   }

//	Send response to the client
//	   RequestDispatcher rd = req.getRequestDispatcher("staticresp.html");
//	   			rd.forward(req, resp);
	
	
//	Dynamic response
	 
	   resp.setContentType("text/html");
	PrintWriter writer = resp.getWriter();
	writer.println("<html>\r\n"
			+ "<head>\r\n"
			+ "<meta charset=\"UTF-8\">\r\n"
			+ "<title>Insert title here</title>\r\n"
			+ "</head>\r\n"
			+ "<body>\r\n"
			+ "	<h3>Thank you for your Response " + name +" </h3>\r\n"
			+ "</body>\r\n"
			+ "</html>");
	
	
	
	
	
	
	
	
	
	
	
//0	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
	
//1		
//		System.out.println("doGet() service method called:");

//2
//		resp.setContentType("text/html");
//		PrintWriter writer = resp.getWriter();
//		writer.println("<h3>WELCOME FRIENDS:</h3>");
//		writer.println("doGet() service method called:");
//}	
	
//	3
//		 @Override
//		public void init() throws ServletException {
//			 System.out.println("init() method called");
//		}
//		
//		@Override
//			protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//					throws ServletException, IOException {
//			System.out.println("doGet()services  method called");
//			}
//		
//		@Override
//			public void destroy() {
//			 System.out.println("destroy() method called");
//				
//			}
	
		  
	
	}
}
	






