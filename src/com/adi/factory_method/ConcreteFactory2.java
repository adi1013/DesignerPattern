package com.adi.factory_method;

public class ConcreteFactory2 implements Factory{

    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
