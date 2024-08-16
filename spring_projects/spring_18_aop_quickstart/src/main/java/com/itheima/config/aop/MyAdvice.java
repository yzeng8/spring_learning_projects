package com.itheima.config.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.itheima.dao.BookDao.update())")
    public void pointCut(){}

    @Before("pointCut()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }}
