<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="studentStyle.css">
</head>
<body>

 <div class="form">
        <div class="input-box"> 
	         <form action="regform" method="post">
	            <input class="input"  type="text" name="name1" placeholder="First & Last name"><br><br>
	            <input class="input" type="email" name="email1" placeholder="Email"><br><br>
	            <input  class="input" type="password" name="password1" placeholder="Password">
	            <input class="btn" type="submit" value="Create">
	          
	        </form>
        <a class="login-btn" href="login.jsp"> Login </a>
    
        </div>

  </div>

</body>
</html>