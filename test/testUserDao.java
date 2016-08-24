import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.luo.bean.User;
import com.luo.service.UserService;

@ContextConfiguration("classpath:beans.xml")
public class testUserDao extends AbstractJUnit4SpringContextTests {

	/*@Resource(name="us")
	private static UserService us;*/
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		UserService us = new ClassPathXmlApplicationContext("beans.xml").getBean("us", UserService.class); 
		User user = new User();
		user.setName("阿胶狂热时间考虑");
		us.save(user);
	}	
/*	@Test
	public void testSave() {
		User user = new User();
		user.setName("阿胶狂热时间考虑");
		us.save(user);
	}*/
}
