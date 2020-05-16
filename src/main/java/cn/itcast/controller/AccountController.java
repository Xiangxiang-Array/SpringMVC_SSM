package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @version v1.0
 * @ProjectName: springmvc
 * @ClassName: AccountController
 * @Description: TODO(web层 控制器)
 * @Author: Array
 * @Date: 2020/5/16 13:09
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户信息...");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletResponse response, HttpServletRequest request) throws IOException {
        System.out.println("表现层：查询所有账户信息...");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"findAll");
    }

}
