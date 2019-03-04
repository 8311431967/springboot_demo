package springaop.demo.ioc.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kunrong
 * @date 2018/12/21 17:23
 */
public class TestService {
    @Test
    public void testAuto(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("autoWrite.xml");
        UserService userService = (UserService) ac.getBean("userService");
        userService.done();
    }
}
