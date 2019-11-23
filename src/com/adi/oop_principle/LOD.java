package com.adi.oop_principle;

import java.util.Random;

public class LOD {

    public static void main(String[] args) {
//        CPU cpu = new CPU();
//        cpu.calculate();


        CPU2 cpu2 = new CPU2();
        cpu2.calculate();
    }

}


class CPU{

    private Cache cache = new Cache();
    private Memory memory = new Memory();
    private Block block = new Block();

    public void calculate() {
        if (! cache.readC()) {
            if (! memory.readM()) {
                block.readB();
            }
        }
    }
}

class Cache{

    private static final Random rc = new Random();

    public boolean readC(){
        System.out.println("从缓存中查找数据");
        boolean c = rc.nextBoolean();
        if (c) {
            System.out.println("缓存命中，开始运算");
        } else{
            System.out.println("缓存没有命中");
        }
        return c;
    }

}

class Memory{

    private static final Random rm= new Random();

    public boolean readM(){

        System.out.println("从内存读取数据");

        boolean b = rm.nextBoolean();

        if (b) {
            System.out.println("内存命中，读取数据到缓存");
        } else {
            System.out.println("内存没有命中");
        }
        return b;
    }
}

class Block{


    public void readB(){
        System.out.println("从磁盘读取数据到主存");
    }
}


class CPU2{

    private Cache2 cache = new Cache2();

    public void calculate() {
        cache.readC();
    }
}

class Cache2{

    private static final Random rc = new Random();
    private Memory2 memory = new Memory2();


    public void readC(){
        System.out.println("从缓存中查找数据");
        boolean c = rc.nextBoolean();
        if (c) {
            System.out.println("缓存命中，开始运算");
        } else{
            System.out.println("缓存没有命中");
            memory.readM();
        }
    }

}

class Memory2{

    private static final Random rm= new Random();
    private Block block = new Block();

    public void readM(){

        System.out.println("从内存读取数据");

        boolean b = rm.nextBoolean();

        if (b) {
            System.out.println("内存命中，读取数据到缓存");
        } else {
            System.out.println("内存没有命中");
            block.readB();
        }
    }
}
