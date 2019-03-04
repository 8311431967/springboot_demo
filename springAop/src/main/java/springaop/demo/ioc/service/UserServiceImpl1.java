package springaop.demo.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import springaop.demo.ioc.dao.UserDao;

/**
 * @author kunrong
 * @date 2018/12/21 17:49
 */
public class UserServiceImpl1 implements UserService{
    //标注成员变量
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    //占位符方式
    @Value("${jdbc.url}")
    private String url;
    //SpEL表达方式，其中代表xml配置文件中的id值configProperties
    @Value("#{configProperties['jdbc.username']}")
    private String userName;

    @Override
    public void done(){
        System.out.println("url:"+url);
        System.out.println("username:"+userName);
        userDao.doSomething();
    }
}
