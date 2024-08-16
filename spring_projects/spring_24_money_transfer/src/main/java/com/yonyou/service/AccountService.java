package com.yonyou.service;

import com.yonyou.pojo.Account;

public interface AccountService {
    public void transferMoney(Account account1, Account account2, Integer transferAmount);
}
