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
	<br>
	<center>			


<form action="run.com.Recievec">
<h3>First line accept two Integer with whitespaces and print the sum as their output. <br>
Input Format: <br>
10 <br>
20
<br>
Output Format: <br>

The Sum of the Integers are 30


</h3> <br>

<h1>Enter Your Code in C Language  Below</h1> <br>
<textarea rows="25" cols="100" name="area"> </textarea>
<br>
<br>
<br>
<input type="submit" value="Compile">
</form>
</center>
	

</body>
</html>