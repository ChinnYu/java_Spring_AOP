package com.jason.spring_aop_23;

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
public class Math implements IMath {
    public void add(int n1, int n2){
        System.out.println(n1+"+"+n2+"="+(n1+n2));
    }
    public void sub(int n1, int n2){
        System.out.println(n1+"-"+n2+"="+(n1-n2));
    }
    public void mul(int n1, int n2){
        System.out.println(n1+"*"+n2+"="+(n1*n2));
    }
    public void div(int n1, int n2){
        System.out.println(n1+"/"+n2+"="+(n1/n2));
    }
    public void mod(int n1, int n2){
        System.out.println(n1+"%"+n2+"="+(n1%n2));
    }
    public void lazy(){
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
