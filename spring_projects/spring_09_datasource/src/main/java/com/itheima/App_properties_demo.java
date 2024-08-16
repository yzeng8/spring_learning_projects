package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;


public class App_properties_demo {
    public static void main(String[] args) {
        //1.从类路径中加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从绝对路径中加载配置文件
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("C:\\Users\\zengy\\intern_project\\spring_projects\\spring_09_datasource\\src\\main\\resources\\applicationContext.xml");

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
