import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.luo.action.UserAction;
import com.luo.bean.User;
import com.luo.service.UserService;

@ContextConfiguration("classpath:beans.xml")
public class testUserDao extends AbstractJUnit4SpringContextTests {

	

	private UserAction ua;
	public UserAction getUa() {
		return ua;
	}
	@Resource(name="userAction")
	public void setUa(UserAction ua) {
		this.ua = ua;
	}
	
	private UserService us;
	public UserService getUs() {
		return us;
	}
	@Resource(name="us")
	public void setUs(UserService us) {
		this.us = us;
	}
	
	@Test
	public void testSave() {
		try {
			ua.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testC3p0() {
		User user = new User();
		user.setName("分发技术");
		us.save(user);
	}
}
