package com.jason.spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-24
 */
public class BookService {
    IBookDao bookDao;

    public BookService() {
        //bookDao = new MySQLBookDao();//傳統作法(較無彈性)

        //容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bookbean01.xml");
        //從容器中獲取名稱為bookdao的物件的bean
        bookDao = ctx.getBean("bookdao",IBookDao.class);

    }

    /**
        * 新增一本書
        */
    public void addNewBook(){
        String bookname = "SpringMVC讚";
        bookDao.save(bookname);
    }
}
