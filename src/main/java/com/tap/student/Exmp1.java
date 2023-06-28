//package com.tap.student;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class Exmp1
// */
//@WebServlet("/Exmp1")
//public class Exmp1 extends HttpServlet {
//	Connection con = null;
//	PreparedStatement pstmt = null;
//	ResultSet res = null;
//	String url="jdbc:mysql://localhost:3306/tapacdemy";
//	String un="root";
//	String pwd="YSD1008";
//	
//	   @Override
//	public void init() throws ServletException {
//	
//		   System.out.println("Hello");
//	 try {
//			Class.forName("com.mysql.cj.jbdc.Driver");
//			System.out.println("k");
//			con = DriverManager.getConnection(url,un,pwd);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	  }
//	 
//	   
//	   @Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
//			throws ServletException, IOException {
//		   
//	       resp.setContentType("text/html");
//	       PrintWriter writer = resp.getWriter();
//	       
//	       
//		   String username = req.getParameter("username");
//		   String password = req.getParameter("password");
//		   
//		    try {
//		    	String query = "select * from tapstudent where un=? and pwd=?";
//				pstmt = con.prepareStatement(query);
//				pstmt.setString(1, username);
//				pstmt.setString(2, password);
//				 res = pstmt.executeQuery();
//				 
//				 if (res.next() == true) 
//				 {
//					 writer.println("<h3>Welcome" + res.getString(2) +"!</h3>");
//				} else {
//					writer.println("<h3>Invalid login detailes.Plse try again!</h3>");
//				}
//				
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//	   }
//	   
//	   @Override
//	public void destroy() {
//	}
//	   
//
//}
