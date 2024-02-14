<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<link rel="stylesheet" type="text/css" href="facultyStyle.css">
<body>
 
 	<div class="box">
 		<div class="box-form">
	 		<form action="facultyform" method="post">
	 			<input class="input" type="text" name="name1"	 placeholder="First & Last Name"><br><br>
	 			<!-- <input class="input" type="text"  name="course1" placeholder="Course"><br><br> -->
	 			<label for="" style="color:red"> Choose one or more subject </label><br>
	 			<input type="checkbox" name="Mathmatics">Mathmatics<br>
	 			<input type="checkbox" name="History">History<br>
	 			<input class="input" type="email" name="email1" placeholder="email"> <br><br>
	 			<input class="input" type="password" name="password1" placeholder="password"><br><br>
	 			<input class="btn" type="submit" placeholde="submit">
	 		
	 		</form>
 		</div>
 		
 		
 	</div>

</body>
</html>