package mybbs.service;

import javax.annotation.Resource;

import mybbs.dao.UserDAO;
import mybbs.model.User;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Resource
	private UserDAO userDAO;
	
	public boolean checkUsernameExists(String username) {
		return userDAO.checkUsernameExists(username);
	}
	
	public boolean checkEmailExists(String username) {
		return userDAO.checkEmailExists(username);
	}
	
	public boolean register(User user) {
		if(checkUsernameExists(user.getUsername()) || checkEmailExists(user.getEmail()))
			return false;
		return userDAO.addUser(user);
	}
}
