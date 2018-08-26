package com.jason.spring_aop_24;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */
public class TestMath {
    public static void main(String[] args) {
        //產生實體Spring代理工廠
        ProxyFactory proxy = new ProxyFactory();
        //設置被代理的物件
        proxy.setTarget(new Math());
        //添加通知，橫切邏輯
        proxy.addAdvice(new BeforeAdvice());
        proxy.addAdvice(new AfterAdvice());
        proxy.addAdvice(new SurroundAdvice());

        //從代理工廠中獲得代理物件
        Math math = (Math) proxy.getProxy();

        int n1=98,n2=3;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
        math.mod(n1,n2);
    }
}
