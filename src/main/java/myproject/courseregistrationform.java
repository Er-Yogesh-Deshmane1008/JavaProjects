package myproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/courseregistrationform")
public class courseregistrationform extends HttpServlet {
	
	Connection con = null;
	PreparedStatement pstmt = null;
//	ResultSet res = null;
	String url="jdbc:mysql://localhost:3306/myprojects";
	String un="root";
	String pwd="YSD1008";
	
	   @Override
	public void init() throws ServletException {
	
		   System.out.println("Hello");
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("k");
			con = DriverManager.getConnection(url,un,pwd);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	 
	   
	   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		   
	       resp.setContentType("text/html");
	       PrintWriter writer = resp.getWriter();
	       
	       
		   String Username = req.getParameter("Username");
		   String Firstname = req.getParameter("Firstname");
		   String EmailID = req.getParameter("Emailid");
		   String Password = req.getParameter("password");
		   
		   System.out.println("Username =" + Username);
		   System.out.println("Firstname =" + Firstname);
		   System.out.println("EmailId =" + EmailID);
		   System.out.println("Password =" + Password);
		   
		    try {
		    	String query = "insert into loginpage(`UserName`,`FirstName`,`Email`,`Password`) VALUES (?,?,?,?)";
				pstmt = con.prepareStatement(query);
				 Scanner scan = new Scanner(System.in);
				
				pstmt.setString(1, Username);
				pstmt.setString(2, Firstname);
				pstmt.setString(3, EmailID);
				pstmt.setString(4, Password);
				pstmt.executeUpdate();
				 
			
			} catch (Exception e) {
				e.printStackTrace();
			}
	   }
	   
	   @Override
	public void destroy() {
	}
	
	}

