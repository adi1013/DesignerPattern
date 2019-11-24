package com.adi.prototype_pattern;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {

    private final static Map<String, Prototype> hashmap = new HashMap<>();

    private PrototypeManager(){}

    static {
        hashmap.put("concrete4",new ConcretePrototype4(new Ref2()));
    }

    static class Singleton{
        private static final PrototypeManager p = new PrototypeManager();
    }

    public static PrototypeManager getInstance(){
        return Singleton.p;
    }

    public void put(String key, Prototype p){
        hashmap.put(key, p);
    }

    public Prototype get(String key){
        return (Prototype) hashmap.get(key).clone();
    }
}

class Test{
    public static void main(String[] args) {
        PrototypeManager instance = PrototypeManager.getInstance();
        ConcretePrototype4 concrete4 = (ConcretePrototype4)instance.get("concrete4");
    }
}

