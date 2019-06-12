package cn.itcast.service.Impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询账户");
        return dao.findAll();
    }

    @Override
    public void add(Account account) {
        System.out.println("业务层保存账户");
        dao.add(account);
    }
}
