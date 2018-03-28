<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JavaGeeks</title>
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
</head>
<body>
	<%
			if(session.getAttribute("email") == null)
				response.sendRedirect("login.jsp");
		%>
	<ul>
		<li> <a href="Choose.jsp">Home</a></li>
		<li> <a href="changePassword.jsp">Change Password</a></li>
		<li> <a href="logout.jsp">Logout</a></li>
		
		
	</ul>
	<center>
	</h1>
	<% out.print("Welcome");%>
	<% out.print(session.getAttribute("email"));%>
	</center>

<h3> <a href="JavaQuestions.html">Choose For JAVA</a></h3> <br> <br>
<h3> <a href="CQuestions.html">Choose For C</a></h3> <br> <br>

</body>
</html>