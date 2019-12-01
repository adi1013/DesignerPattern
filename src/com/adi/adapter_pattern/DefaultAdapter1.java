package com.adi.adapter_pattern;

/**
 * jdk1.8以前的缺省适配器实现方式
 * */
public class DefaultAdapter1 {
}
//目标抽象接口
interface Target{
    void method1();
    void method2();
    void method3();
    void method4();
}
//缺省适配器
abstract class AbstractAdapter implements Target{
    @Override
    public abstract void method1() ;
    @Override
    public void method2() {

    }
    @Override
    public void method3() {

    }
    @Override
    public void method4() {

    }
}
//真实业务适配器
class ConcreteAdapter extends AbstractAdapter{
    @Override
    public void method1() {
        //适配内容...
    }
}