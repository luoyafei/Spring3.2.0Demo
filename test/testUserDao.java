import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.luo.action.UserAction;

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
	
	@Test
	public void testSave() {
		try {
			ua.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
