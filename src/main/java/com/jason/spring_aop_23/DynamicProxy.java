package com.jason.spring_aop_23;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */

/**
 * 動態代理
 */
public class DynamicProxy implements InvocationHandler {
    /**
        * 目標代理對象
        */
    Object target ;

    //獲得被代理後的物件(打包代理包起來)
    public Object getProxyObject(Object target){
        this.target = target;
        return Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public void lazy() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /**
        *   調用目標物件的方法
        * @param proxy
        * @param method
        * @param args
        * @return
        * @throws Throwable
        */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long span = System.currentTimeMillis();
        lazy();
        Object result = method.invoke(target,args);
        System.out.println("用時: "+(System.currentTimeMillis()-span));
        return result;
    }
}
