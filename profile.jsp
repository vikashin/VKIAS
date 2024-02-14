 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="profileStyle.css?b=1">
</head>
<body>

<%
 	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.setHeader("Pragma", "no-cache");
	///response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
	if(session.getAttribute("session_name")==null){
		response.sendRedirect("login.jsp");
	}
%>

<div class="box">
	<div class="user-profile">
	 User profile
	</div>
	
	
	<div class="box-filed">

		<h1>Name:${session_name}</h1>
		<h1>Email:${session_name1}</h1>
		
		<!-- <a class="lnk1" href="faculty" >Get Faculties Detail</a> <br><br> -->
	
		<!-- <a class="lnk2" href="LogOut"> Log Out</a> -->
		
		<form method="post" action="faculty">
			<input type="checkbox" name="Mathmatics">
			<label for="Mathmatics">Mathmatics</label><br><br>
			
			<input type="checkbox" name="History">
			<label for="History">History</label><br><br>
			<input type="submit" class="btn" name="submit" placeholder="click">
		</form>
	
	</div>
	
	
</div>

<a class="lnk2" href="LogOut"> Log Out</a>




</body>
</html>  

 <%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>
<link rel="stylesheet" type="text/css" href="profileStyle.css">
<style>
    /* Additional CSS styles */
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        margin: 0;
        padding: 0;
    }
    .box {
        width: 400px;
        margin: 100px auto;
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .box-header {
        background-color: #007bff;
        color: #fff;
        text-align: center;
        padding: 20px 0;
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
        font-size: 24px;
    }
    .box-body {
        padding: 20px;
    }
    .lnk2 {
        background-color: #dc3545;
        color: #fff;
        padding: 10px 20px;
        text-decoration: none;
        border-radius: 5px;
        display: inline-block;
        transition: background-color 0.3s ease;
    }
    .lnk2:hover {
        background-color: #c82333;
    }
    .form-group {
        margin-bottom: 20px;
    }
    .form-group label {
        font-weight: bold;
        font-size: 18px;
    }
    .form-group input[type="checkbox"] {
        margin-right: 10px;
    }
    .submit-btn {
        background-color: #28a745;
        color: #fff;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        font-size: 18px;
        transition: background-color 0.3s ease;
    }
    .submit-btn:hover {
        background-color: #218838;
    }
</style>
</head>
<body>

<div class="box">
    <div class="box-header">
        User Profile
    </div>
    <div class="box-body">
        <h2>Name: ${session_name}</h2>
        <h2>Email: ${session_name1}</h2>
        <a class="lnk2" href="LogOut">Log Out</a>
        <form method="post" action="faculty" class="form">
            <div class="form-group">
                <input type="checkbox" id="Mathmatics" name="Mathmatics">
                <label for="Mathmatics">Mathematics</label>
            </div>
            <div class="form-group">
                <input type="checkbox" id="History" name="History">
                <label for="History">History</label>
            </div>
            <input type="submit" name="submit" value="Submit" class="submit-btn">
        </form>
    </div>
</div>

</body>
</html> --%>
