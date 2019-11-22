package com.adi.oop_principle;

/**
 * 开闭原则
 */
public class OCP {

    public static void main(String[] args) {
        Button b = new CircleButton();
        System.out.println(b.getType());
        //某一天我想换成矩形按钮
        b = new RectangleButton();
        System.out.println(b.getType());
    }

}

interface Button{
    String getType();
}

class CircleButton implements Button{
    @Override
    public String getType() {
        return "圆形按钮";
    }
}

class RectangleButton implements Button{
    @Override
    public String getType() {
        return "矩形按钮";
    }
}

