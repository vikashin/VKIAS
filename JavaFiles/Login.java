

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

@WebServlet("/user_login")
public class Login extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		
	 
	 String email=req.getParameter("email1");
	 String password=req.getParameter("password1");
	 
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("success");
			PreparedStatement ps=con.prepareStatement("select * from upsc where email=? and password=?");
			
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			
//			HttpSession session=req.getSession();
//			session.setAttribute("session_name",rs.getString("name"));
			
			if(rs.next()) {
				HttpSession session=req.getSession();
				System.out.println("seeion id is:"+session);
				session.setAttribute("session_name",rs.getString("name"));
				session.setAttribute("session_name1",rs.getString("email"));
				/*
				 * RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
				 * rd.include(req, res);
				 */
				res.sendRedirect("./profile.jsp");
			}
			else {
				res.setContentType("text/html");
				out.print("<h3 style=color:red;text-align:center> invalid email or password! </h3>");
				
				 RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
				 rd.include(req,res);
				
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("hi");
	}
	
	

}
