package com.adi.prototype_pattern;

public class CloneableTest {

    public static void main(String[] args) {
        ConcretePrototype3 p1 = new ConcretePrototype3(new Ref());
        ConcretePrototype3 p2 = (ConcretePrototype3)p1.clone();
        System.out.println("p1 == p2 ? "+String.valueOf(p1==p2));
        System.out.println("p1.getRef() == p2.getRef() "+String.valueOf(p1.getRef()==p2.getRef()));
    }

}

class ConcretePrototype3 implements Prototype, Cloneable{

    private Ref ref;

    public ConcretePrototype3(Ref ref) {
        this.ref = ref;
    }

    public Ref getRef() {
        return ref;
    }

    @Override
    public Prototype clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype)o;
    }
}

class Ref implements Cloneable{

}
