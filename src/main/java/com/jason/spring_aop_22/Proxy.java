package com.jason.spring_aop_22;

import java.util.Random;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */

/**
 * 靜態代理
 */
public class Proxy implements IMath{

    IMath target = new Math();

    public void add(int n1, int n2) {
        long span = System.currentTimeMillis();
        lazy();
        target.add(n1,n2);
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }

    public void sub(int n1, int n2) {
        long span = System.currentTimeMillis();
        lazy();
        target.sub(n1,n2);
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }

    public void mul(int n1, int n2) {
        long span = System.currentTimeMillis();
        lazy();
        target.mul(n1,n2);
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }

    public void div(int n1, int n2) {
        long span = System.currentTimeMillis();
        lazy();
        target.div(n1,n2);
        System.out.println("用時: "+(System.currentTimeMillis()-span));
    }

    public void lazy() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
