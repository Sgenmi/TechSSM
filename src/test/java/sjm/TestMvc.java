package sjm;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml","classpath:spring/spring-mybatis.xml"}) 
public class TestMvc {


	
	@Test
	public void insert() {
		
//		short a = 5;
//		User user = new User();
//		
//		user.setUsername("sjm");
//		user.setPassword("5555");
//		user.setAge(a);
//		
//		
//		int b = userService.insertUser(user);
//		
//		System.out.println(b);
//		
		
		System.out.println("5555");
		
		
	}

}
