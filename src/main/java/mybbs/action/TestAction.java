package mybbs.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestAction {
	
	@RequestMapping("test2")
	public String test() {
		return "test";
	}
}
