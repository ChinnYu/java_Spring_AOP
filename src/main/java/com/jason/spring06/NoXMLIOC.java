package com.jason.spring06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */
public class NoXMLIOC {
    public static void main(String[] args) {
        //基於類型的配置
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCfg.class);
        ICarDao dao = ctx.getBean("oracleDao",ICarDao.class);
        dao.add("dddspring");
        ICarDao dao1 = ctx.getBean("mysqlDao",ICarDao.class);
        dao1.add("dddspring");

    }
}

interface ICarDao{
    void add(String name);
}
@Repository("oracleDao")
class CarDao implements ICarDao{

    public void add(String name) {
        System.out.println("成功"+name);
    }
}
@Configuration
@ComponentScan(basePackages = "com.jason.spring06")
class AppCfg{
    //下面可不寫,直接@Repository
    @Bean()
    ICarDao mysqlDao(){//方法名為name
        return new CarDao();
    }
}