package com.adi.Singleton;

public class Singleton3 {

    private static volatile Singleton3 singleton;

    private Singleton3(){}

    public static Singleton3 getInstance(){

        if (null == singleton) {
            synchronized (Singleton3.class) {
                if (null == singleton) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }

}
