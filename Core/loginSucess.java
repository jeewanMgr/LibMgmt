package library.edu;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class login
 */
@WebServlet(description = "user login", urlPatterns = { "/loginpath" })
public class loginSucess extends HttpServlet {
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		//input for the user
		String uname = request.getParameter("uname");
		String pass2 = request.getParameter("pass");
		
		try{
			Connection conn = null;
			 Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeewan", "root", "");
			
			//stmt = conn.createStatement();
			stmt = conn.createStatement();
			String sql ="select Email, Password from Register where Email='"+uname+"' and Password='"+pass2+"'";
			
			 ResultSet rs = stmt.executeQuery(sql);
				if(rs.next())
				{
					response.sendRedirect("Main.html");
				} else 
				{
					response.sendRedirect("login.html");
				}
				
				//input for the user
			/* String username=request.getParameter("uname");
			 String userpass=request.getParameter("pass");*/
				
				//use input in the form
			
		/*	PrintWriter out = response.getWriter();
			out.println("THis is user input from the form");
			out.println("You type the name: "+ uname);
			out.println("You type the password: "+ pass2);
			System.out.println("running in server");
			out.println("THis is data from the database");
			out.println("You type the name: "+name);
			out.println("You type the password: "+pass);*/
			
				/*if(name.equals(uname) && pass.equals(pass2))
				{
					PrintWriter out = response.getWriter();
					out.println("You have a sucess!!!! ");
					response.sendRedirect("Main.html");
					
				}
				else {
					response.sendRedirect("login.html");
				}
				
				response.sendRedirect("Main.html");*/
			  // Clean-up environment
	         rs.close();
	         stmt.close();
	         conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
	}
		
		
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
}