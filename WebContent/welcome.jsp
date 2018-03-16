<!DOCTYPE html>
<html>
<head>
<link href="bootstrap.min.css" rel="stylesheet" type="text/css">
<meta charset="ISO-8859-1">
<style type="text/css">
	li
	{
		float: left;
	}
	ul
	{
	
		list-style-type: none;
		margin: 0;
		padding: 0;
		overflow: hidden;
		background-color:#333; 
	}
	li a
	{
		display: inline-block;
		color: white;
		text-align: center;
		padding: 14px 16px;
		text-decoration: none; 
	}
	li a:HOVER {
	background-color: aqua;
}
</style>
<title>HOME</title>

</head>

<body>
		<%
			if(session.getAttribute("email") == null)
				response.sendRedirect("login.jsp");
		%>
	<ul>
		<li> <a href="welcome.jsp">Home</a></li>
		<li> <a href="changePassword.jsp">Change Password</a></li>
		<li> <a href="logout.jsp">Logout</a></li>
		
		
	</ul>	
	<br>
	<br>
	<h1>
	<center>
	</h1>
	<% out.print(session.getAttribute("email"));%>
	</center>	
</body>
</html>