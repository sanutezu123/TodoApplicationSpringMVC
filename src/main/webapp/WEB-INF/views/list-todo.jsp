
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href = "webjars/bootstrap/4.4.1-1/css/bootstrap.min.css" rel = "stylesheet">
	<title>My Todo list</title>
</head>
<body>
	<div class = "container">
	Hi ${name}
	
		
 	
	<table class = "table table-striped">
		 <thead class="thead-light">
			<tr>
				<td>ID</td>
				<td>Description</td>
				<td>Done</td>
				<td></td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = "${todos}" var = "todo">
				<tr> 
			 		<td>${todo.id}</td>
					<td>${todo.desc}</td>
					<td>${todo.done}</td> 
					<td><a href = "/updateTodo?id=${todo.id}" class = "btn btn-primary">Update</a>
						<a href = "/deleteTodo?id=${todo.id}" class = "btn btn-danger">Delete</a> 	
					</td>
				<tr> 
			</c:forEach>		
		</tbody>
	</table>
	
	<a href = "/addTodo" >Add Todo</a>
	</div>
	
	
	
	
	<script type="webjars/jquery/3.3.1/jquery.js"></script>
	<script type="webjars/bootstrap/4.4.1-1/js/bootstrap.min.js"></script>
</body>
</html>