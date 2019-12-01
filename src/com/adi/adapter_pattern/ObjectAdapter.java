package com.adi.adapter_pattern;

public class ObjectAdapter {
    public static void main(String[] args) {
        HomePowerSupply2 hps = new Transformer2(new HighVoltagePowerSupply2());
        System.out.println(hps.availableVoltage());
    }
}


//家用电源
interface HomePowerSupply2 {
    Integer availableVoltage();
}
//高压电源
class HighVoltagePowerSupply2{
    public Integer transmissionVoltage(){
        final Integer voltage = 2200;
        return voltage;
    }
}
//变压器
class Transformer2 implements HomePowerSupply2{

    private HighVoltagePowerSupply2 hvps;

    public Transformer2(HighVoltagePowerSupply2 hvps) {
        this.hvps = hvps;
    }

    @Override
    public Integer availableVoltage() {
        return hvps.transmissionVoltage()/10;
    }
}