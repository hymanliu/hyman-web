package junit.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hyman.web.bean.User;
import com.hyman.web.service.UserService;


public class UserServiceTest extends BaseJunitTest{
	@Autowired
	private UserService userService;
	
	@Test
	public void testSave() {
	}

	@Test
	public void testFind() {
		
		User user = userService.find("hyman");
		System.out.println(user.getRealName());
	}
	
	
}
