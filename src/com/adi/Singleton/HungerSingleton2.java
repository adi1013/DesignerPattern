package com.adi.Singleton;

public class HungerSingleton2 {

    private HungerSingleton2(){}

    public static HungerSingleton2 getInstance(){
        return Inner.singleton;
    }

    private static class Inner{
        private static final HungerSingleton2 singleton
                                    = new HungerSingleton2();
    }



}
