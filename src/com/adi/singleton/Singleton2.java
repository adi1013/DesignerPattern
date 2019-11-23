package com.adi.singleton;

public class Singleton2 {


    private static volatile Singleton2 singleton;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        synchronized (Singleton2.class){
            if (null == singleton) {
                singleton = new Singleton2();
            }
        }
        return singleton;
    }


}
