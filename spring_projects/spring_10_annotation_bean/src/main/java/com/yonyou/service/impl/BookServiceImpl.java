package com.yonyou.service.impl;

import com.yonyou.dao.BookDao;
import com.yonyou.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("bookService")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save");
        bookDao.save();
    }

    @PostConstruct
    public void init() {
        System.out.println("init service....");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy service...");
    }
}
