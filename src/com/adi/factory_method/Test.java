package com.adi.factory_method;

public class Test {


    public static void main(String[] args) {
        Factory concreteFactory1 = new ConcreteFactory1();
        Factory concreteFactory2 = new ConcreteFactory2();
        Product product = concreteFactory1.createProduct();
        product.function();
        Product product1 = concreteFactory2.createProduct();
        product1.function();

    }

}
