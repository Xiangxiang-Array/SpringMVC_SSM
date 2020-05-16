package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @version v1.0
 * @ProjectName: springmvc
 * @ClassName: TestMybatis
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Array
 * @Date: 2020/5/16 15:52
 */
public class TestMybatis {

    /**
     * 测试查询
     * @author Array
     * @date 2020/5/16 16:01
     */
    @Test
    public void run1() throws IOException {
        // 加载 Mybatis 配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建 SqlSessionFactory 对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 查询所有的数据
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        // 释放资源
        session.close();
        in.close();
    }

    /**
     * 测试保存
     * @author Array
     * @date 2020/5/16 16:01
     */
    @Test
    public void run2() throws IOException {
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(400d);
        // 加载 Mybatis 配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建 SqlSessionFactory 对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        dao.saveAccount(account);
        // 提交事务
        session.commit();

        // 释放资源
        session.close();
        in.close();
        run1();
    }
}
