package com.adi.proxy_pattern.dynanic_proxy_by_jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 设置sun.misc.ProxyGenerator.saveGeneratedFiles=true获取中间代理类
 */
public class JDKDynamicServiceProxy implements InvocationHandler {

    private Object target;

    public JDKDynamicServiceProxy(Object target) {
        this.target = target;
    }

    public <T> T getProxy(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------pre----------");
        method.invoke(target,args);
        System.out.println("---------post----------");
        return null;
    }
}
