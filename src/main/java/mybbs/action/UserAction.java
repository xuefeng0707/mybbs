package mybbs.action;

import java.util.Date;

import javax.annotation.Resource;

import mybbs.model.User;
import mybbs.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Resource
	private UserService service;
	
	@RequestMapping("/register.action")
	public String register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("email") String email) {
		System.out.println(username + "-" + password + "-" + email);
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setCreateDate(new Date());
		
		service.register(user);
		
		return "redirect:/index";
	}
	
	@RequestMapping("/login.action")
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println(username + "-" + password);
		
		return "redirect:/index";
	}
	
	@RequestMapping(value="/validateEmail.action",method=RequestMethod.POST)
	@ResponseBody
	public String validateEmail(@RequestParam("email") String email) {
		return service.checkEmailExists(email) ? "true" : "false";
	}
	
	@RequestMapping(value="/validateUsername.action",method=RequestMethod.POST)
	@ResponseBody
	public String validateUsername(@RequestParam("username") String username) {
		return service.checkUsernameExists(username) ? "true" : "false";
	}
}
