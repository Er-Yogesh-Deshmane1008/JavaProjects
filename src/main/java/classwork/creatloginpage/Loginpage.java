package classwork.creatloginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginpage1")
public class Loginpage extends HttpServlet {
	static int count=3;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String username = req.getParameter("username");
		String pwd= req.getParameter("password");
		
		String password = "1234";
		
		if(pwd.equals(password)) 
		{
			
			resp.sendRedirect("Welcome");
		}
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Loginpage");
		String username = req.getParameter("username");
		String pwd= req.getParameter("password");
		
		String password = "1234";
		
		if(pwd.equals(password)) 
		{
			RequestDispatcher rd = req.getRequestDispatcher("Welcome");
			rd.forward(req, resp);
		}
		else 
		{    
			
			if(count>0)
			{
				resp.setContentType("text/html");
				
				PrintWriter writer = resp.getWriter();
				writer.print("Invalid details"+" "+count+" " +"Attemp Left!.");
				count--;
				
				RequestDispatcher rd = req.getRequestDispatcher("first.html");
				rd.include(req, resp);
			}
			else 
			{
				RequestDispatcher rd = req.getRequestDispatcher("Block");
				rd.forward(req, resp);
				
			}
		}
		
	}
	
	
	
}
