package com.adi.oop_principle;

public class SRP {
    public static void main(String[] args) {
        Template t1 = new ATemplate();
        t1.service();
    }
}

abstract class Template{

    void pre(){
        System.out.println("前处理");
    }

    abstract void operation();

    void after(){
        System.out.println("后处理");
    }


    void service(){
        pre();
        operation();
        after();
    }
}

class ATemplate extends Template{
    @Override
    void operation() {
        System.out.println("A操作");
    }
}


interface Dog{

    void bark();

    void walk();

    void belongWho();
}