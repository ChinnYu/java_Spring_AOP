package com.jason.spring_aop_21;

import com.jason.spring_aop_22.IMath;
import com.jason.spring_aop_22.Proxy;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-25
 */
public class TestMath {
    public static void main(String[] args) {
        IMath math = new Proxy();
        int n1=999,n2=112;
        math.add(n1,n2);
        math.sub(n1,n2);
        math.mul(n1,n2);
        math.div(n1,n2);
    }
}
