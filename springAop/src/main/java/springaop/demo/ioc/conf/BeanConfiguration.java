package springaop.demo.ioc.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springaop.demo.ioc.dao.AccountDao;
import springaop.demo.ioc.dao.AccountDaoImpl;
import springaop.demo.ioc.service.AccountService;
import springaop.demo.ioc.service.AccountServiceImpl;

/**
 * @author kunrong
 * @date 2018/12/21 16:28
 */
@Configuration
public class BeanConfiguration {
    @Bean
    public AccountDao accountDao(){
        return new AccountDaoImpl();
    }

    @Bean
    public AccountService accountService(){
        AccountServiceImpl bean=new AccountServiceImpl();
        //注入dao
        bean.setAccountDao(accountDao());
        return bean;
    }
}
