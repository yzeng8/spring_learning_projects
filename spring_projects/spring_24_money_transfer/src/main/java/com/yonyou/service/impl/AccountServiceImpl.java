package com.yonyou.service.impl;

import com.yonyou.dao.AccountDao;
import com.yonyou.pojo.Account;
import com.yonyou.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;


    @Override
    public void transferMoney(String out,String in,Integer transferAmount) {
        accountDao.inMoney(out,transferAmount);
        accountDao.outMoney(in,transferAmount);
    }
}
