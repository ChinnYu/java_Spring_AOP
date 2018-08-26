package com.jason.spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-24
 */
public class School {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bookbean01.xml","beans02.xml");
        Person tom = ctx.getBean("tom",Person.class);
        Person rose = ctx.getBean("rose",Person.class);
        Person rosec = ctx.getBean("rose",Person.class);
//        System.out.println(tom);
        //Address taipei = ctx.getBean("taipei",Address.class);
        System.out.println(tom);
        System.out.println(rose);
        System.out.println(rosec==rose);
    }
}
