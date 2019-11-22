package com.adi.Singleton;

public enum HungerSingleton3 {

    SINGLETON;

    public void test(){
        System.out.println("hello world!!!");
    }

    public static HungerSingleton3 getInstance(){
        return HungerSingleton3.SINGLETON;
    }

}
