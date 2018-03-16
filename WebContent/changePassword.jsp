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
	<ul>
		<li> <a href="Choose.jsp">HOME</a></li>
		<li> <a href="logout.jsp">LOGOUT</a></li>
		
		
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
	<form action="login.controller.ChangePassword" method="post">
		<pre>
			Current Password	:	<input type="password" name="cntpassword"> <br>
			New Password		:	<input type="password" name="newpassword"> <br>
			Confirm Password	:	<input type="password" name="cnfpassword"> <br>
							<input type="submit" value="Change Password" class="btn btn-primary">
		</pre>
	</form>	
</body>
</html>














