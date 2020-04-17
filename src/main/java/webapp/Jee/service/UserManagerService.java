package webapp.Jee.service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webapp.Jee.service.model.User;

@Service
public class UserManagerService {
	@Autowired
	private List<User> userList;
	public boolean createUser(User user) {
	 
		userList.add(user);
		return true;
	}
}
