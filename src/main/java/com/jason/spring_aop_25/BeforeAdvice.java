package com.jason.spring_aop_25;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @program: java_Spring_0823
 * @description:
 * @author: Liu
 * @create: 2018-08-26
 */
public class BeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("調用方法"+method.getName()+"前置通知");
    }

}

//後置通知
class AfterAdvice implements AfterReturningAdvice{

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("結束方法"+method.getName()+"後置通知");
    }
}


class SurroundAdvice implements MethodInterceptor{

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("環繞通知前");
        //方法調用
        Object result = methodInvocation.proceed();
        System.out.println("環繞通知後");
        return result;
    }
}

