package com.adi.Singleton;

/**
 * 懒汉式
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if (null == singleton)
            singleton = new Singleton();
        return singleton;
    }

}
