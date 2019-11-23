package com.adi.oop_principle;

public class ISP {
}


/**
 * 某公司的产品接口设计
 */
interface Product{

    void phone();

    void computer();

    void ipad();

}

/**
 * 手机代工厂去代工这家公司的手机产品
 */
class PhoneFactory implements Product{
    @Override
    public void phone() {
        System.out.println("代工该公司手机业务");
    }

    @Override
    public void computer() {

    }

    @Override
    public void ipad() {

    }
}


interface Phone{
    void phone();
}
interface Computer{
    void computer();
}
interface Ipad{
    void ipad();
}

class PhoneFactory2 implements Phone{
    @Override
    public void phone() {
        System.out.println("代工手机业务");
    }
}
class ComputerFactory2 implements Computer{
    @Override
    public void computer() {
        System.out.println("代工电脑业务");
    }
}
class IpadFactory2 implements Ipad{
    @Override
    public void ipad() {
        System.out.println("代工平板业务");
    }
}