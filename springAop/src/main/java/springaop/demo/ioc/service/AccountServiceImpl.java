package springaop.demo.ioc.service;

import springaop.demo.ioc.dao.AccountDao;

/**
 * @author kunrong
 * @date 2018/12/21 16:04
 */
public class AccountServiceImpl implements AccountService {
   private AccountDao accountDao;

    public AccountServiceImpl() {
    }

    public AccountServiceImpl(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void doSomething() {
        System.out.println("AccountServiceImpl do something....");
        accountDao.addAccount();
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
