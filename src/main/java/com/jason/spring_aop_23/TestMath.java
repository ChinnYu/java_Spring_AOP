package com.jason.spring_aop_23;

import java.lang.reflect.Proxy;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */
public class TestMath {
    public static void main(String[] args) {
        //實力化一個動態代理的真實對象
        //DynamicProxy proxy = new DynamicProxy(new Math());
        //獲得一個被代理後的代理
        IMath math = (IMath) new DynamicProxy().getProxyObject(new Math());
        int n1=98,n2=3;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
        math.mod(n1,n2);
    }
}
