package com.adi.abstract_factory;

class GereeAirConditioner implements AirConditioner{
    @Override
    public void refrigeration() {
        System.out.println("格力空调制冷");
    }
}
class GereeFreezer implements Freezer{
    @Override
    public void keepFresh() {
        System.out.println("格力冰箱保鲜");
    }
}
class GereeWasher implements Washer{
    @Override
    public void wash() {
        System.out.println("格力洗衣机洗衣服");
    }
}