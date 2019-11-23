package com.adi.abstract_factory;

public class GereeFactory implements AbstractFactory {
    @Override
    public AirConditioner createAirConditioner() {
        return new GereeAirConditioner();
    }
    @Override
    public Washer createWasher() {
        return new GereeWasher();
    }
    @Override
    public Freezer createFreezer() {
        return new GereeFreezer();
    }

}
