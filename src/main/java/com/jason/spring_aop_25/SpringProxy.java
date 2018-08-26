package com.jason.spring_aop_25;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-26
 */
public class SpringProxy<T> implements MethodInterceptor {

    public T getProxyObject(Object target){
        //產生實體Spring代理工廠
        ProxyFactory proxy = new ProxyFactory();
        //設置被代理的物件
        proxy.setTarget(target);
        //添加通知，橫切邏輯
        proxy.addAdvice(this);
        //從代理工廠中獲得代理物件
        return (T) proxy.getProxy();
    }

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        //調用方法獲得結果
        Object reult = methodInvocation.proceed();
        after(reult);
        return reult;
    }

    public void before(){
        System.out.println("調用方法前");
    }

    public void after(Object result){
        System.out.println("調用方法後");
    }
}
