package com.adi.adapter_pattern;

public class DefaultAdapter2 {
}
//目标抽象接口
interface Target2{
    default void method1(){}
    default void method2(){}
    default void method3(){}
    default void method4(){}
}
//实际业务适配器
class ConcreteAdapter2 implements Target2{
    @Override
    public void method1() {
        //适配内容...
    }
}