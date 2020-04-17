<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Todo</title>
	<link href = "webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" rel = "stylesheet">
	<link href = "resources/css/main.css" rel = "stylesheet">
</head>
<body>
	<div class = "container">
		<h1>Add a item to your todo List</h1>
		<hr>
		<form action = "/addTodo" method = "POST"> 
			 <div class="form-group">
   				 <label for="todoTask">Add your Task</label>
  				 <input type="text" class="form-control" id="todo-task" 
  				 name = "desc" placeholder="Your Task here" title="Please fill your task" required>
 			 </div>
			<button class = "btn btn-primary" type = "submit">Add</button>	
		</form>	
	</div>
	<script type="webjars/jquery/3.3.1/jquery.js"></script>
	<script type="webjars/bootstrap/4.4.1-1/js/bootstrap.min.js"></script>
</body>
</html>