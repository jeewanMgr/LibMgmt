package library.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class server
 */
@WebServlet(description = "first servlet", urlPatterns = { "/server" })
public class server extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("Username");
		String pass=request.getParameter("pwd");
		System.out.println(name);
		
		
	/*	if(name.equalsIgnoreCase("jeewan") && pass.equalsIgnoreCase("magar"))
		{
			response.sendRedirect("pages/form.jsp");
		} else
		{
			response.sendRedirect("login.html");
		}*/
		response.sendRedirect("pages/form.jsp");
		//PrintWriter out = response.getWriter();
		//out.println("welcome to the networks");
		//response.sendRedirect("pages/form.jsp");
		//System.out.println("jeewan thapa magar");	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
