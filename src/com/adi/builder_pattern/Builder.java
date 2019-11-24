package com.adi.builder_pattern;

public abstract class Builder {

    private Product product = new Product();

    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();
    public Product getAchievement(){
        return this.product;
    }
}

class Product{

    private String A;
    private Integer B;
    private Double C;

    public Product() { }
    public String getA() {
        return A;
    }
    public void setA(String a) {
        A = a;
    }
    public Integer getB() {
        return B;
    }
    public void setB(Integer b) {
        B = b;
    }
    public Double getC() {
        return C;
    }
    public void setC(Double c) {
        C = c;
    }
    @Override
    public String toString() {
        return "Product{" +
                "A='" + A + '\'' +
                ", B=" + B +
                ", C=" + C +
                '}';
    }
}