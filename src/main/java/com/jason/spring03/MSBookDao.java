package com.jason.spring03;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-24
 */
//可不給名子
//@Component()//未指定名稱,即類名
@Service()
@Scope("prototype")
public class MSBookDao implements IBookDao{
    public void add() {
        System.out.println("新增圖書成功MS!!");
    }
}
