package com.yonyou;

import com.yonyou.dao.BookDao;
import com.yonyou.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        System.out.print(bookDao);
        bookDao.save();
//        BookService bookService = (BookService) ctx.getBean("bookService");
//        System.out.print(bookService);
    }
}
