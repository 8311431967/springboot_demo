package springaop.demo.ioc.model;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kunrong
 * @date 2018/12/21 16:45
 */
public class TestData {
    @Test
    public void data() {
        ApplicationContext proxy = new ClassPathXmlApplicationContext("ioc-config.xml");
        Account account = (Account) proxy.getBean("account");
        System.out.println(account.toString());
    }
    @Test
    public void testUser() {
        ApplicationContext proxy = new ClassPathXmlApplicationContext("ioc-config.xml");
        User user = (User) proxy.getBean("user");
        System.out.println(user.toString());
    }
}
