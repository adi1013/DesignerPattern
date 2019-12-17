package com.adi.proxy_pattern.dynamic_proxy_by_cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\IDEA Java Project\\j2ee\\DesignerPattern");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibDynamicService.class);
        enhancer.setCallback(new CglibDynamicServiceProxy());
        CglibDynamicService proxy = (CglibDynamicService) enhancer.create();
        proxy.doSometing();
        proxy.finalDoSomething();
    }
}
