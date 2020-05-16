package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version v1.0
 * @ProjectName: springmvc
 * @ClassName: TestSpring
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Array
 * @Date: 2020/5/16 13:18
 */

public class TestSpring {

    @Test
    public void run1(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");
        // 调用方法
        as.findAll();
    }
}
