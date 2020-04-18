<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Todo</title>
	<link href = "webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" rel = "stylesheet">
	<link href = "resources/css/main.css" rel = "stylesheet">
</head>
<body>
	${updateTodo}
	<div class = "container">
		<c:choose>
			<c:when test="${empty updateTodo}">
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
			</c:when>
			<c:otherwise>
				<h1>Update your todo List</h1>
				<hr>
				<form action = "/updateTodo" method = "POST"> 
					 <div class="form-group">
					 	 <div class = "row">
					 	 	<div class = "col-md-12">
					 	 		<input type = "hidden" name = "id" value = "${todo.id} ">
				   				<label for="todoTask">Update Todo</label>
				  				<input type="text" class="form-control" id="todo-task" value = "${todo.desc}"
				  				 name = "desc" placeholder="Your Task here" title="Please fill your task" required>
					 	 	</div>
					 	 </div>
					 	 <div class = "row" >
					 	 	<div class = "col-md-12">
					 	 		<label for = "Todo">Completion Status:</label>
					 	 		<select name = "done" class="browser-default custom-select custom-select-lg mb-3">
		  				 			<option value = "False">False</option>
		  				 			<option value = "True">True</option>
		  				 		</select>
					 	 	</div>
					 	 </div>
		 			 </div>
					<button class = "btn btn-primary" type = "submit">Update</button>	
				</form>	
			</c:otherwise>
		</c:choose>
	</div>
	<script type="webjars/jquery/3.3.1/jquery.js"></script>
	<script type="webjars/bootstrap/4.4.1-1/js/bootstrap.min.js"></script>
</body>
</html>