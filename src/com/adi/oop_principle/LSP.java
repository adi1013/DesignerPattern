package com.adi.oop_principle;

/**
 * 里氏置换原则
 */
public class LSP {

    public static void main(String[] args) {
        Mother mother = new Mother("大红");
        Father father = new Father("老王", mother);
        System.out.println(father.sleepWith());

        System.out.println("----------------------");

        mother = new Daughter("小红");
        father.setMother(mother);
        System.out.println(father.sleepWith());
    }
}

class Father{

    private String name;

    private Mother mother;

    public Father(String name, Mother mother) {
        this.name = name;
        this.mother = mother;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public String sleepWith(){
        return "爸爸("+this.name+")和"+mother.Who();
    }

}

class Mother{

    private String name;

    public Mother() {
    }

    public Mother(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public String Who(){
        return "妈妈（"+this.name+"）睡在一起";
    }
}

class Daughter extends Mother{

    public Daughter(String name){
        super(name);
    }


    public String withDaughter(){
        return "3岁的女儿（"+super.getName()+"）睡在一起";
    }
}