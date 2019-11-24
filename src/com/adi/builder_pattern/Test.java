package com.adi.builder_pattern;


public class Test {

    public static void main(String[] args) {
        Decorate d = new Decorate(new Scheme1Builder());
        System.out.println(d.assemble());
        System.out.println("--------------------------------");
        d.setBuilder(new Scheme2Builder());
        System.out.println(d.assemble());

    }

}
