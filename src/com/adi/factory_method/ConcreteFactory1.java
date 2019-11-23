package com.adi.factory_method;

public class ConcreteFactory1 implements Factory{

    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
