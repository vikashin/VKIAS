


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogOut")
public class UserlogOut extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		HttpSession session=req.getSession();
		session.invalidate();
		/*
		 * RequestDispatcher rd=req.getRequestDispatcher("/login.jsp"); rd.include(req,
		 * res);
		 */
		
		res.sendRedirect("login.jsp");
		
		
		System.out.println("hi");
	}
	
	

}
