package com.adi.builder_pattern;

public class Builder2 {

    private Product product = new Product();

    public Builder2 buildA(){
        this.product.setA("hello world!!!");
        return this;
    }
    public Builder2 buildB(){
        this.product.setB(123);
        return this;
    }
    public Builder2 buildC(){
        this.product.setC(12334.2131d);
        return this;
    }

    public Product getAchievement(){
        return this.product;
    }

    public static void main(String[] args) {
        Builder2 builder2 = new Builder2();
        System.out.println(builder2.buildA().buildC().getAchievement());
    }
}
