package com.adi.abstract_factory;

class MideaAirConditioner implements AirConditioner {
    @Override
    public void refrigeration() {
        System.out.println("--美的空调制冷--");
    }
}
class MideaFreezer implements Freezer{
    @Override
    public void keepFresh() {
        System.out.println("--美的冰箱保鲜--");
    }
}
class MideaWasher implements Washer{
    @Override
    public void wash() {
        System.out.println("--美的洗衣机洗衣服--");
    }
}