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
<body background="s1.jpeg">
	<ul>
		<li> <a href="index.jsp">HOME</a></li>
		<li> <a href="login.jsp">LOGIN</a></li>
		<li> <a href="register.jsp">REGISTER</a></li>
		
	</ul>
	<br>
		<center>			
			<%
				if(request.getParameter("msg1") != null)
				{
				out.print("<font color='green'>");
				out.print(request.getParameter("msg1"));
				out.print("</font>");
				}
			if(request.getParameter("msg2") != null)
			{
			out.print("<font color='red'>");
			out.print(request.getParameter("msg2"));
			out.print("</font>");
			}
			%>
		</center>
	<br>
	<form action="login.controller.Register" method="post">
	<center>
		<pre>
Email		:	<input type="email" name="email"> <br>
Password	:	<input type="password" name="password"> <br>
Mobile No	:	<input type="text" name="mobile">	<br>
City		:	<select name="city">
				<option>BBSR</option>
				<option>CTC</option>
				<option>RKL</option>
				<option>PURI</option>
				
			</select>
			<input type="submit" value="Register" class="btn btn-primary">
		</pre>
		</center>
	</form>	
	
</body>
</html>














