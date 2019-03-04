package springaop.demo.ioc.dao;

/**
 * @author kunrong
 * @date 2018/12/21 17:16
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void doSomething() {
        System.out.println("do something....");
    }
}
