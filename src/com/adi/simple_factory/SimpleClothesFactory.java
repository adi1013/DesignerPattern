package com.adi.simple_factory;

public class SimpleClothesFactory {

    public static Clothes createClothes(String params) throws Exception {

        switch (params){
            case "pants":
                return new Pants();
            case "skirt":
                return new Skirt();
            case "shirt":
                return new Shirt();
            default:
                return null;
        }

//        反射方式
//        return (Clothes) Class.forName(params).newInstance();
    }

}
