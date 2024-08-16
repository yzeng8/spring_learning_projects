package com.itheima.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {

    //匹配业务层的所有方法
    @Pointcut("execution(* com.itheima.service.*Service.*(..))")
    public void pc(){}

    @Around("ProjectAdvice.pc()")
    public void run_speed(ProceedingJoinPoint pjp) throws Throwable {
        Signature sig = pjp.getSignature();
        String className = sig.getDeclaringTypeName(); //类型
        String methodName = sig.getName();  //方法名

        long start = System.currentTimeMillis();
        //Object ret = null;
        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("10k Execution Time Elapse for:"+className+"."+ methodName +"is:" + (end - start) + "ms.");
        //return ret;
    }
}
