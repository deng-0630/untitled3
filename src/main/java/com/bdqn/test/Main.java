package com.bdqn.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-aop.xml");
        Caculater p= (Caculater)ctx.getBean("caculaterImpl");
        int r=p.add(4,5);
        System.out.println(r);

    }
}
