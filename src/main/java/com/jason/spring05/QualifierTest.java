package com.jason.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */
@Service
public class QualifierTest {
    @Autowired
    @Qualifier("daoA")
    IBookDao dao;
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bookbean05.xml");
        QualifierTest obj = ctx.getBean(QualifierTest.class);
        System.out.println(obj.dao);
    }
}

interface IBookDao{}

@Repository("daoA")
class BookDaoA implements IBookDao{

}
@Repository("daoB")
class BookDaoB implements IBookDao{

}