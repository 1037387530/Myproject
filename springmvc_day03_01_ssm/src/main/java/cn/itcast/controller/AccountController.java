package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.Impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;

    @RequestMapping("/findAll")
    public  String findAll(Model model){
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return  "list";
    }


    @RequestMapping("/add")
    public  void  add(Account account,HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.add(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
