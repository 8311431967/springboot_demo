package springaop.demo.ioc.dao;

/**
 * @author kunrong
 * @date 2018/12/21 16:02
 */
public class AccountDaoImpl implements AccountDao{
    @Override
    public void addAccount() {
        System.out.println("addAcount...");
    }
}
