<%@page import="java.util.Date"%>
<html>
<head>
<title>Task Manager</title>
	<link href = "webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" rel = "stylesheet">
	<link href = "resources/css/main.css" rel = "stylesheet">
	
</head>
<body>
	<div class="sidenav">
         <div class="login-main-text">
            <h2>Task Manager<br> Login Page</h2>
            <p> Login or register from here to access.</p>
         </div>
      </div>
      <div class="main">
      	
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <h3 class = "headings"><u>Please fill up the details below</u></h3>
               <form action = "register" method = "POST">
                  <div class="form-group">
                     <label>Name</label>
                     <input type="text" name = "name" class="form-control" placeholder="User Name">
                  </div>
                  <div class="form-group">
                     <label>Email Id</label>
                     <input type="text" name = "email" class="form-control" placeholder="Email Id">
                  </div>
                  <div class="form-group">
                     <label>Username</label>
                     <input type="text" name = "username" class="form-control" placeholder="Username">
                  </div>
                  <div class="form-group">
                     <label>Password</label>
                     <input type="password" name = "password" class="form-control" placeholder="Password">
                  </div>
                  <button type="submit" class="btn btn-black">Register</button>
               </form>
            </div>
         </div>
      </div>
	<script type="webjars/jquery/3.3.1/jquery.js"></script>
	<script type="webjars/bootstrap/4.4.1-1/js/bootstrap.min.js"></script>	
</body>
</html>


