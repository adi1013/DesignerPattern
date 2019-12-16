package com.adi.proxy_pattern.dynamic_proxy_by_cglib;

public class CglibDynamicService {

    public CglibDynamicService() {
        System.out.println("Real Service creating");
    }

    public final void finalDoSomething() {
        System.out.println("final method");
    }

    public void doSometing() {
        System.out.println("natural method");
    }
}
