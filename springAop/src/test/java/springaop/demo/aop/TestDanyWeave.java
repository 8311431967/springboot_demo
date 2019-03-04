package springaop.demo.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springaop.demo.aop.danyweave.UserDao;

/**
 * @author kunrong
 * @date 2018/12/24 21:04
 */
//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath: spring-aspectj-xml")
public class TestDanyWeave {
    @Autowired
    UserDao userDao;

    @Test
    public void aspectJTest(){
        userDao.addUser();
    }


    @Test
    public void aspectXml() {
       userDao.addUser();

    }
}
