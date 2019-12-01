package com.adi.adapter_pattern;
//家用电源
interface HomePowerSupply {
    Integer availableVoltage();
}
//高压电源
class HighVoltagePowerSupply{
    public Integer transmissionVoltage(){
        final Integer voltage = 2200;
        return voltage;
    }
}
//变压器
class Transformer extends HighVoltagePowerSupply implements HomePowerSupply{
    @Override
    public Integer availableVoltage() {
        return super.transmissionVoltage()/10;
    }
}

public class ClassAdapter{
    public static void main(String[] args) {
        HomePowerSupply homePowerSupply = new Transformer();
        System.out.println(homePowerSupply.availableVoltage());
    }
}
