package com.bdqn.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    @Before("execution(public int com.bdqn.test.CaculaterImpl.add(int, int))")
    public  void before1(JoinPoint joinPoint){
        String mname=joinPoint.getSignature().getName();
        System.out.println(String.format("%s被调用了，参数是：%s",mname, Arrays.asList(joinPoint.getArgs())));
    }

    public   void after(){

    }
}
