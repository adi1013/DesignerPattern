package com.adi.abstract_factory;

public class SongXiaFactory implements AbstractFactory {
    @Override
    public AirConditioner createAirConditioner() {
        return new SongXiaAirConditioner();
    }

    @Override
    public Washer createWasher() {
        return new SongXiaWasher();
    }

    @Override
    public Freezer createFreezer() {
        return new SongXiaFreezer();
    }
}
