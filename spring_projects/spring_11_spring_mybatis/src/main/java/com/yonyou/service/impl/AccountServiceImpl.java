package com.yonyou.service.impl;

import com.yonyou.dao.AccountDao;
import com.yonyou.domain.Account;
import com.yonyou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    public void save(Account account) {
        accountDao.save(account);
    }


    public void update(Account account) {
        accountDao.update(account);
    }


    public void delete(Integer id) {
        accountDao.delete(id);
    }


    public Account findById(Integer id) {
        return accountDao.findById(id);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
