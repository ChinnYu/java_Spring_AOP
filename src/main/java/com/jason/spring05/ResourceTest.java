package com.jason.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */
@Service
public class ResourceTest {
    @Resource(name = "carA")
    ICarDao dao;
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bookbean05.xml");
        ResourceTest obj = ctx.getBean(ResourceTest.class);
        System.out.println(obj.dao);
    }
}
interface ICarDao{}

@Repository("carA")
class CarDaoA implements ICarDao{

}
@Repository("carB")
class CarDaoB implements ICarDao{

}
