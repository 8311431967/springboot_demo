package springaop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kunrong
 * @date 2018/12/21 15:11
 */
public class AopTest {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("aopContext.xml");

        Service service = ac.getBean("service", Service.class);
        service.save("### 1232536 #########");
    }
    }
