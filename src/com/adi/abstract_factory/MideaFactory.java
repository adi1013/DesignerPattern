package com.adi.abstract_factory;

public class MideaFactory implements AbstractFactory {
    @Override
    public AirConditioner createAirConditioner() {
        return new MideaAirConditioner();
    }

    @Override
    public Washer createWasher() {
        return new MideaWasher();
    }

    @Override
    public Freezer createFreezer() {
        return new MideaFreezer();
    }
}
