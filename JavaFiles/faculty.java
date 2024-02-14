import java.io.IOException;
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
import java.io.IOException;

@WebServlet("/facultyform")

public class faculty extends HttpServlet{
	
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		PrintWriter out=res.getWriter();
//		
//	 
	 String email=req.getParameter("email1");
	 String password=req.getParameter("password1");
	 String name=req.getParameter("name1");
	 String Mathmatics=req.getParameter("Mathmatics");
	 if(Mathmatics!=null) {
		 Mathmatics="Yes";
	 }
	 else {
		 Mathmatics="No";
	 }
	 String History=req.getParameter("History");
	 if(History!=null) {
		 History="Yes";
	 }
	 else {
		 History="No";
	 }
		
		
		
	 
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db","root","root");
			System.out.println("success in faculty");
			//PreparedStatement ps=con.prepareStatement("select * from faculty");
			PreparedStatement ps=con.prepareStatement("insert into faculty value(?,?,?,?,?)");
			ps.setString(1, email);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, Mathmatics);
			ps.setString(5, History);
	
			int cnt=ps.executeUpdate();
			
			if(cnt>0) {
				
				res.setContentType("text/html");
				out.print("<h3> Register successfully</h3>");
				HttpSession session=req.getSession();
				System.out.println("seeion id2 is:"+session);
				
				
				 RequestDispatcher rd=req.getRequestDispatcher("/faculty.jsp"); 
				 rd.include(req,res);
				
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("hi");
	}
	

}
