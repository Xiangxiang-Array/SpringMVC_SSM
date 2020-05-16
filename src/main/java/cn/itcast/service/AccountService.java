package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: springmvc
 * @ClassName: AccountService
 * @Description: TODO(Acoount 业务层)
 * @Author: Array
 * @Date: 2020/5/16 13:07
 */
public interface AccountService {

    /**
     * 查询所有账户信息
     * @return list 所有成员
     * @author Array
     * @date 2020/5/16 13:04
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @author Array
     * @date 2020/5/16 13:05
     */
    public void saveAccount(Account account);

}
