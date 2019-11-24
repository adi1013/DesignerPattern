package com.adi.builder_pattern;

public class Decorate {

    private Builder builder;

    public Decorate(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product assemble(){
        builder.buildA();
        builder.buildC();
        return builder.getAchievement();
    }
}


class Scheme1Builder extends Builder{
    @Override
    public void buildA() {
        super.getAchievement().setA("Scheme1Builder buildA");
    }
    @Override
    public void buildB() {
        super.getAchievement().setB(12580);
    }
    @Override
    public void buildC() {
        super.getAchievement().setC(11111.111d);
    }
}

class Scheme2Builder extends Builder{
    @Override
    public void buildA() {
        super.getAchievement().setA("Scheme2Builder buildA");
    }
    @Override
    public void buildB() {
        super.getAchievement().setB(10086);
    }
    @Override
    public void buildC() {
        super.getAchievement().setC(22222.222d);
    }
}
