package com.jason.spring_aop_25;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */
public class TestMath {
    public static void main(String[] args) {
        Math math = new SpringProxy<Math>().getProxyObject(new Math());

        int n1=98,n2=3;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
        math.mod(n1,n2);
    }
}
