package com.jason.spring03;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-24
 */
//可不給名子
@Repository("bookdao")
public class BookDao implements IBookDao{
    public void add() {
        System.out.println("新增圖書成功!!");
    }
}
