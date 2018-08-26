package com.jason.spring05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
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
public class InjectTest {
    //注入成員變量,字段
    @Resource
    IUserDao dao1;
    IUserDao dao2;
    IUserDao dao3;
    IUserDao dao4;

    //注入給屬性
    @Autowired
    public void setDao3(IUserDao dao3) {
        this.dao3 = dao3;
    }


    public void injectDao3(@Autowired IUserDao dao4) {
        this.dao4 = dao4;
    }

    //注入給構造方法
    @Autowired
    public InjectTest(IUserDao dao2) {
        this.dao2 = dao2;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bookbean05.xml");
        InjectTest obj = ctx.getBean(InjectTest.class);
        System.out.println(obj.dao1);
        System.out.println(obj.dao2);
        System.out.println(obj.dao3);
        System.out.println(obj.dao4);

    }
}

interface IUserDao{}

@Repository
//@Scope("prototype")
class UserDaoA implements IUserDao{

}


