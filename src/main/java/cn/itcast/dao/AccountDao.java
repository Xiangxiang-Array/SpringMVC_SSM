package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version v1.0
 * @ProjectName: springmvc
 * @ClassName: AccountDao
 * @Description: TODO(账号)
 * @Author: Array
 * @Date: 2020/5/16 13:04
 */
@Repository
public interface AccountDao {

    /**
     * 查询所有账户信息
     * @return list 所有成员
     * @author Array
     * @date 2020/5/16 13:04
     */
    @Select("select * from account")
    public List<Account> findAll();
    
    /**
     * 保存账户信息
     * @author Array
     * @date 2020/5/16 13:05
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);
}
