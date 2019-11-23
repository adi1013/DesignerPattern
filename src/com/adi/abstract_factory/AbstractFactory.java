package com.adi.abstract_factory;

public interface AbstractFactory {
    AirConditioner createAirConditioner();
    Washer createWasher();
    Freezer createFreezer();
}

interface Freezer {
    void keepFresh();
}

interface AirConditioner {
    void refrigeration();
}
interface Washer {
    void wash();
}


