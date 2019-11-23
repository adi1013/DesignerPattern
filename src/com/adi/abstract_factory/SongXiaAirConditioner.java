package com.adi.abstract_factory;

class SongXiaAirConditioner implements AirConditioner {
    @Override
    public void refrigeration() {
        System.out.println("----松下空调制冷------");
    }
}
class SongXiaFreezer implements Freezer{
    @Override
    public void keepFresh() {
        System.out.println("----松下冰箱保鲜----");
    }
}
class SongXiaWasher implements Washer{
    @Override
    public void wash() {
        System.out.println("----松下洗衣机洗衣服----");
    }
}
