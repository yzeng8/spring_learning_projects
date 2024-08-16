package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataAdvice {

    // 对所有业务层的方法处理字符
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    private void pt(){}

    @Around("DataAdvice.pt()")
    public Object trimStr(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++) {
            // 只查了string没有string builder
            if(args[i].getClass().equals(String.class)){
                args[i] = ((String)args[i]).toLowerCase();//转换全小写比对
                args[i] = ((String)args[i]).trim(); //去掉空格
            }
        }

        Object ret = pjp.proceed(args);
        return ret;
    }

}
