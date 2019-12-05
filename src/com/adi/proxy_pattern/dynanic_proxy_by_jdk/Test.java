package com.adi.proxy_pattern.dynanic_proxy_by_jdk;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        JDKDynamicServiceProxy jdkDynamicServiceProxy = new JDKDynamicServiceProxy(new RealDynamicService());
        DynamicService proxy = jdkDynamicServiceProxy.getProxy();
        proxy.doSomething();

    }
}
