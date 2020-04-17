package webapp.Jee;

 
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import webapp.Jee.service.LoginService;

@Controller
@SessionAttributes("name")

public class LoginController {
	
	 private static final Logger logger = Logger.getLogger(LoginController.class.getName());
	 private static final String className = LoginController.class.getName();
	 
	 @Autowired
	 public LoginService service;
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handelLoginPage(@RequestParam String name,@RequestParam String password,
			ModelMap map) {
		logger.entering(className, "handelLoginPage");
		boolean isUserValid =service.isUserValid(name, password);
		if(isUserValid) {
			map.put("name", name);			
		}else {
			map.put("errorMessage", "Invalid credentials");
			return "login";
		}
		return "welcome";
	}
	
	
}
