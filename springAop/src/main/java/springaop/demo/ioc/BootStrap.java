package springaop.demo.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springaop.demo.ioc.conf.BeanConfiguration;
import springaop.demo.ioc.service.AccountService;

/**
 * @author kunrong
 * @date 2018/12/21 16:01
 */
public class BootStrap {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ioc-config.xml");

//        AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
        //多次获取并不会创建多个accountService对象,因为spring默认创建是单实例的作用域
        AccountService accountService= (AccountService) applicationContext.getBean("accountService");
        accountService.doSomething();
    }


}
