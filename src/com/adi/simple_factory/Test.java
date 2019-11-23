package com.adi.simple_factory;

public class Test {

    public static void main(String[] args) {
        try {
            Clothes clothes = SimpleClothesFactory.createClothes("com.adi.simple_factory.Pants");
            clothes.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
