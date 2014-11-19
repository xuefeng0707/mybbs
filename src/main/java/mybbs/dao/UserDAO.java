package mybbs.dao;

import mybbs.model.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends AbstractDAO {
	
	public boolean checkUsernameExists(String username) {
		int count = sqlSession.selectOne("UserDAO.checkUsernameExists", username);
		
		return count > 0;
	}
	
	public boolean checkEmailExists(String email) {
		int count = sqlSession.selectOne("UserDAO.checkEmailExists", email);
		
		return count > 0;
	}
	
	public boolean addUser(User user) {
		// TODO add validation
		
		int num = sqlSession.insert("UserDAO.addUser", user);
		
		return num > 0;
	}
}
