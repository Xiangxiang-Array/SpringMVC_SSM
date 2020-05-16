package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: springmvc
 * @ClassName: AccountServiceImpl
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Array
 * @Date: 2020/5/16 13:08
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 查询所有账户信息
     *
     * @return list 所有成员
     * @author Array
     * @date 2020/5/16 13:04
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有的账户....");
        return accountDao.findAll();
    }

    /**
     * 保存账户信息
     *
     * @param account
     * @author Array
     * @date 2020/5/16 13:05
     */
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户");
        accountDao.saveAccount(account);
    }
}
