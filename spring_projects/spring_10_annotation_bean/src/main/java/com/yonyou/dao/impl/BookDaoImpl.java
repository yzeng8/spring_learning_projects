package com.yonyou.dao.impl;

import com.yonyou.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
//@Scope("singleton")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;//注入的方法

    @Value("${userdefined.usr}")
    private String userDefined;

    public void save() {
        System.out.println("book dao save ...."+name);
        System.out.println(userDefined);
    }

    @PostConstruct
    public void init() {
        System.out.println("init ....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy ...");
    }
}
