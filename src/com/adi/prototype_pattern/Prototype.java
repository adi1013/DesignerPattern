package com.adi.prototype_pattern;

public interface Prototype {
     Prototype clone();
}

class ConcretePrototype1 implements Prototype {

    private Integer A;

    public Integer getA() {
        return A;
    }

    public void setA(Integer a) {
        A = a;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype1 concretePrototype = new ConcretePrototype1();
        concretePrototype.setA(this.getA());
        return concretePrototype;
    }
}

class ConcretePrototype2 implements Prototype {

    private String B;

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype2 concretePrototype = new ConcretePrototype2();
        concretePrototype.setB(this.getB());
        return concretePrototype;
    }
}

class Client{
    public static void main(String[] args) {
        Prototype p1 = new ConcretePrototype1();
        Prototype p2 = p1.clone();
        System.out.println("p1 和 p2 相等吗? " + String.valueOf(p1==p2));
    }
}