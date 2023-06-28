package classwork.creatloginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Welcome")
public class Welcome extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		@SuppressWarnings("unused")
		String un = req.getParameter("username");
		PrintWriter writer = resp.getWriter();
		
		HttpSession session = req.getSession();
		Object user = session.getAttribute("username");
		
		writer.print(user + " "+ "Welcome to Tapacadamy");
		
	}
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("Welcome");
		PrintWriter writer = resp.getWriter();
		writer.print("Welcome To Tapacademy");
	}
}
