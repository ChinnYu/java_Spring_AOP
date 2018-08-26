package com.jason.spring04;

import com.jason.spring04.IBookDao;
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

    public void save(String name){
        System.out.println(name);
    }
}
