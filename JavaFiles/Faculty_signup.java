


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/faculty-form")
public class Faculty_signup extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		PrintWriter out=res.getWriter();
		
	 
	 String email=req.getParameter("email1");
	 String password=req.getParameter("password1");
	 String name=req.getParameter("name1");
	 String subject=req.getParameter("course1");
	 
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("success");
			
			
			PreparedStatement ps=con.prepareStatement("insert into faculty value(?,?,?,?)");
			ps.setString(1, email);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, subject);
			
			int cnt=ps.executeUpdate();
			if(cnt>0) 
			{
				res.setContentType("text/html");
				out.print("<h3> Register successfully</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/faculty.jsp");
				rd.include(req, res);
			}
			
			
			/*
			 * ps.setString(1, email); ps.setString(2, password);
			 * 
			 * ResultSet rs=ps.executeQuery();
			 */
			
//			HttpSession session=req.getSession();
//			session.setAttribute("session_name",rs.getString("name"));
			/*
			 * if(rs.next()) { HttpSession session=req.getSession();
			 * session.setAttribute("session_name",rs.getString("name"));
			 * session.setAttribute("session_name1",rs.getString("email"));
			 * RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			 * rd.include(req, res); }
			 */
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("hi");
	}
	
	

}
