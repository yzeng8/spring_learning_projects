package com.yonyou;

import com.yonyou.config.SpringConfig;
import com.yonyou.dao.AccountDao;
import com.yonyou.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App_under_spring {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);

        System.out.println(accountService.findAll());

    }
}
