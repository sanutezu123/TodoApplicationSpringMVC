
package webapp.Jee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import webapp.Jee.service.*;
import webapp.Jee.service.model.Todo;

import java.text.SimpleDateFormat;
import java.util.*;
@Controller
public class TodoController {
	
	@Autowired
	ToDoService todoservice;
	
	@RequestMapping(value = "/listTodo", method = RequestMethod.GET)
	public String showTodoList(ModelMap modelMap,@SessionAttribute("name") String name) {
		System.out.println("User name"+name);
 		List<Todo> todoListResult = todoservice.retrieveTodo(name);
		modelMap.addAttribute("todos",todoListResult);
		
		return "list-todo";
	}
	@RequestMapping(value = "/addTodo", method = RequestMethod.GET)
	public String showAddTodo() {
		return "todo";
	}
	
	@RequestMapping(value = "/addTodo" , method = RequestMethod.POST)
	public String addTodo(@ModelAttribute Todo todo,
			ModelMap map,@SessionAttribute("name") String user){
		System.out.println("In addTOdo");
		todoservice.addTodo(todo.getDesc(),user, new Date(), false);
	 
		return "redirect:listTodo";
	}
	
	@RequestMapping(value = "/deleteTodo" , method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int id, ModelMap map){
		System.out.println(id);
		todoservice.deleteTodo(id);
		return "redirect:listTodo";
	}
	 
	@RequestMapping(value = "/updateTodo" , method = RequestMethod.GET)
	public String updateTodoShow(@RequestParam int id, ModelMap map){
		String updateTodo = "true";
		Todo todo = todoservice.retrieveTodoById(id);
		map.addAttribute("updateTodo",updateTodo);
		map.addAttribute("todo",todo);
		return "todo";
	}
	
	@RequestMapping(value = "/updateTodo" , method = RequestMethod.POST)
	public String updateTodo(Todo newTodo,@RequestParam int id, ModelMap map){
		System.out.println(newTodo.getDesc());
		System.out.println("is DOne"+newTodo.isDone());
		todoservice.updateTodo(newTodo,id);
		return "redirect:listTodo";
	}
	 
	 
}
