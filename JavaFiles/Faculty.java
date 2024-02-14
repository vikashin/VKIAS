


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/faculty")
public class Faculty extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		PrintWriter out=res.getWriter();
//		
//	 
//	 String email=req.getParameter("email1");
//	 String password=req.getParameter("password1");
		
		String maths=req.getParameter("Mathmatics");
		String history=req.getParameter("History");
		
		
	 
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("success in Faculty");
			PreparedStatement ps=con.prepareStatement("select * from faculty");
	
			ResultSet rs=ps.executeQuery();
//			
////			HttpSession session=req.getSession();
////			session.setAttribute("session_name",rs.getString("name"));
//			
			while(rs.next()) {
				HttpSession session=req.getSession();
				session.setAttribute("session_name",rs.getString("name"));
				session.setAttribute("session_name1",rs.getString("email"));
				session.setAttribute("session_name2",rs.getString("Mathmatics"));
				session.setAttribute("session_name3",rs.getString("History"));
				RequestDispatcher rd=req.getRequestDispatcher("/faculty-detail.jsp");
				rd.include(req, res);
//				out.println("Name:"+rs.getString("name"));
//				out.println("email:"+rs.getString("email"));
//				out.println("-----------------------------------");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("hi");
	}
	
	

}
