package com.adi.adapter_pattern;

public class TwoWayAdapter implements Target3,Adaptee3{
    private Target3 target;
    private Adaptee3 adaptee;

    public TwoWayAdapter(Target3 target) {
        this.target = target;
    }
    public TwoWayAdapter(Adaptee3 adaptee) {
        this.adaptee = adaptee;
    }
    public TwoWayAdapter(Target3 target, Adaptee3 adaptee) {
        this.target = target;
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}

interface Target3{
    void request();
}

interface Adaptee3{
    void specificRequest();
}

