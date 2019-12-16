package com.adi.proxy_pattern.dynamic_proxy_by_cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicServiceProxy implements MethodInterceptor {


    /**
     *
     * @param o cglib生成的被代理对象的子类
     * @param method   被代理方法
     * @param objects  被代理方法参数
     * @param methodProxy   代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method,
                            Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----pre invoke----");
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("----post invoke----");
        return object;
    }
}
