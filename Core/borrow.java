package library.edu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class borrow
 */
@WebServlet("/borrow")
public class borrow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public borrow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		
		String ssn = request.getParameter("ssn");
		
		String book = request.getParameter("bname");
		String faculty = request.getParameter("faculty");
		
		
		try{
			Connection conn = null;
			 Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeewan", "root", "");
			stmt = conn.createStatement();
			
			//String sel="select Email from Regisger where "
			//if()
			
			//stmt = conn.createStatement();
			stmt = conn.createStatement();
			String sql ="insert into BorrowBook values('"+ssn+"','"+book+"','"+faculty+"')";
			
			
			int i=  stmt.executeUpdate(sql);
			  if(i>0)
			  {
				  response.sendRedirect("Main.html");
			  }else {
				  response.sendRedirect("Borrow.html");
			  }
	         stmt.close();
	         conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
	}

	}
}
