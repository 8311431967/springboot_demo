package springaop.demo.ioc.conf;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springaop.demo.aop.danyweave.UserDao;
import springaop.demo.ioc.model.User;
import springaop.demo.ioc.service.AccountService;

/**
 * @author kunrong
 * @date 2018/12/21 16:32
 */
public class Configure {
    @Test
    public void testByConfigurationAnnotation() throws Exception {

        AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        //名称必须BeanConfiguration中工程方法名称一致
        AccountService accountService= (AccountService) config.getBean("accountService");
        accountService.doSomething();

    }

    @Test
    public void testAspect() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("dnayWeave.xml");
        UserDao userDao = (UserDao) ac.getBean("userDaos");
        userDao.addUser();
    }
}
