package webapp.Jee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import webapp.Jee.service.LoginService;
import webapp.Jee.service.UserManagerService;
import webapp.Jee.service.model.User;

@Controller
public class RegistrationController {
	@Autowired
	UserManagerService service;
	@Autowired
	LoginService loginService;
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String showRegisterPage() {
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String createRegistration(User user,ModelMap map) {
 		boolean createUser = loginService.createUser(user);
		if(createUser) {
			map.addAttribute("message", "Registered Successfully");
		}else {
			map.addAttribute("message", "Regestraion failed");
		}
		return "redirect:login";
	}

}
