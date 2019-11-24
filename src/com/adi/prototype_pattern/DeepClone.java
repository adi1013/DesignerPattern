package com.adi.prototype_pattern;

import java.io.*;

public class DeepClone {

    public static void main(String[] args) {
        ConcretePrototype4 p1 = new ConcretePrototype4(new Ref2());
        ConcretePrototype4 p2 = (ConcretePrototype4) p1.clone();
        System.out.println("p1 == p2 ? "+String.valueOf(p1==p2));
        System.out.println("p1.getRef() == p2.getRef() "+String.valueOf(p1.getRef()==p2.getRef()));

    }
}

class ConcretePrototype4 implements Prototype, Serializable {

    private Ref2 ref;

    public ConcretePrototype4() {
    }

    public ConcretePrototype4(Ref2 ref) {
        this.ref = ref;
    }

    public Ref2 getRef() {
        return ref;
    }

    @Override
    public Prototype clone() {
        Object o = null;

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            o = ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  (Prototype) o;
    }
}

class Ref2 implements Serializable{

}

