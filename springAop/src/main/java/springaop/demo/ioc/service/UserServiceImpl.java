package springaop.demo.ioc.service;

import org.springframework.beans.factory.annotation.Autowired;
import springaop.demo.ioc.dao.UserDao;

/**
 * @author kunrong
 * @date 2018/12/21 17:20
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void done() {
    userDao.doSomething();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
