package com.jason.spring_aop_21;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */

import java.util.Random;

/**
 * 算數
 */
public class Math {
    public void add(int n1,int n2){
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1+"+"+n2+"="+(n1+n2));
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }
    public void sub(int n1,int n2){
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1+"-"+n2+"="+(n1-n2));
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }
    public void mul(int n1,int n2){
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1+"*"+n2+"="+(n1*n2));
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }
    public void div(int n1,int n2){
        long span = System.currentTimeMillis();
        lazy();
        System.out.println(n1+"/"+n2+"="+(n1/n2));
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }

    public void lazy(){
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
