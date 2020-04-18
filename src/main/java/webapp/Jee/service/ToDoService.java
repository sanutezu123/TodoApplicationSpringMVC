package webapp.Jee.service;

import java.util.*;

import org.springframework.stereotype.Service;

import webapp.Jee.service.model.*;
@Service
public class ToDoService {
	public static List<Todo> todoList = new ArrayList<Todo>();
	public static int todoCount = 2;
	
	//dummy code for toDoListHardCoded
	 
	
	public void addTodo(String name,String desc,Date targetDate,boolean isDone) {
		todoList.add(new Todo(++todoCount,name,desc,targetDate,isDone));
		
		for(Todo todo:todoList) {
			System.out.println(todo);
		}
	}
	
	public void deleteTodo(int id) {
		Iterator it = todoList.iterator();
		while(it.hasNext()) {
			Todo todo = (Todo)it.next();
			if(todo.getId()== id) {
				it.remove();;
			}
		}
	}
	
	public List<Todo> retrieveTodo(String user){
		List<Todo> filteredTodo = new ArrayList<Todo>();
		System.out.println("iside todo");
		for(Todo todo:todoList) {
			if(todo.getUser().equals(user)) {
				filteredTodo.add(todo);
				System.out.println("Todo found");
			}
		}
		return filteredTodo;
 	}
	
	public Todo retrieveTodoById(int id) {
		Iterator it = todoList.iterator();
		while(it.hasNext()) {
			Todo todo = (Todo)it.next();
			if(todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}
	public void updateTodo(Todo newTodo,int id) {
		for(Todo todo:todoList) {
			if(todo.getId() == id) {
				newTodo.setId(todo.getId());
				newTodo.setUser(todo.getUser());
				todoList.remove(todo);
				todoList.add(newTodo);
			}
		}
		System.out.println("UPdated Todo");
		for(Todo todo:todoList) {
			System.out.println(todo);
		}
	}
}
