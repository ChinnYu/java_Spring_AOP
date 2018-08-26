package com.jason.spring01;

/**
 * @program: java_Spring_0823
 * @description: 使用MySQL完成圖書訪問
 * @author: Liu
 * @create: 2018-08-24
 */
public class MySQLBookDao implements IBookDao {
    public void save(String name) {
        System.out.println("添加圖書"+name+" success MySQL!");
    }
}
