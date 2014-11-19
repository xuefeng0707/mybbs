package mybbs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybbs.service.UserService;

public class MybbsTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		UserService userService = (UserService) context.getBean("userService");
		
		System.out.println(userService);
	}

}
