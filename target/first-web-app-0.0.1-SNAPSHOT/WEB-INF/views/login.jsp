<%@page import="java.util.Date"%>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
<p style = "color:red">${errorMessage}</p>
<div>
<form action = "login.do" method = "post">
Enter your username : 
	<input type="text" name="username">
Enter your Password : 
	<input type="password" name="password">
	<input type="submit">
</form>
</div>
</body>
</html>