package com.adi.proxy_pattern.dynanic_proxy_by_jdk;

public class RealDynamicService implements DynamicService {
    @Override
    public void doSomething() {
        System.out.println("jdk dynamic proxy");
    }
}
