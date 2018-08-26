package com.jason.spring03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-24
 */

public class BookService {

    public static void main(String[] args) {
        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"bookbean03.xml"});
        //從容器中獲取對象
        MSBookDao service = ctx.getBean("MSBookDao",MSBookDao.class);
        service.add();
    }
}
