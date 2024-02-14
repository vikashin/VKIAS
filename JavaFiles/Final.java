

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

@WebServlet("/regform")
public class Final extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		
		PrintWriter out=res.getWriter();
		
	 String name=req.getParameter("name1");
	 String email=req.getParameter("email1");
	 String password=req.getParameter("password1");
	 
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("success");
			PreparedStatement ps=con.prepareStatement("insert into upsc value(?,?,?)");
			
			ps.setString(1, email);
			ps.setString(2, name);
			ps.setString(3, password);
			
			int cnt=ps.executeUpdate();
			
			if(cnt>0) {
				
				res.setContentType("text/html");
				out.print("<h3> Register successfully</h3>");
				HttpSession session=req.getSession();
				System.out.println("seeion id2 is:"+session);
				
				
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
