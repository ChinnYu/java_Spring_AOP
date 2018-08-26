package com.jason.spring04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-24
 */
@Component
public class BookStore {
    @Autowired
    BookService service;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bookbean04.xml");
        //BookService bookService = ctx.getBean("bookservice",BookService.class);
        BookStore bookStore = ctx.getBean(BookStore.class);
        bookStore.service.addNewBook();
    }

}
