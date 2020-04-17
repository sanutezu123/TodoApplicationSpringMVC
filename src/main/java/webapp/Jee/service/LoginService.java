package webapp.Jee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.Jee.service.model.User;

//to create an instance of LoginSerive Bean by spring
@Service
public class LoginService {
	@Autowired
	private List<User> userList;

	public boolean isUserValid(String username, String password) {
		System.out.println("size"+userList.size());
		for(User user:userList) {
			if(user.getUsername()!=null) {
				System.out.println("UserList"+user);
				if(user.getUsername().equals(username) && user.getPassword().equals(password))
					return true;
			}
		}
		return false;
	}
	public boolean createUser(User user) {
		System.out.println("user beofre add"+user);
		userList.add(user);
		for(User newuser:userList) {
			System.out.println("User after adding"+newuser);
		}
		return true;
	}
}
