package com.adi.decorate_pattern;

public class StandardDecoratePattern {
}


abstract class Component{
    public abstract void opertion();
}

class ConcreteComponent extends Component{
    @Override
    public void opertion() {
        //原始组件的功能
    }
}

class Decorate extends Component{

    private Component component;

    public Decorate(Component component) {
        this.component = component;
    }
    @Override
    public void opertion() {
        //调用组件的基本功能
        component.opertion();
    }
}

class ConcreteDecorate extends Decorate{
    public ConcreteDecorate(Component component) {
        super(component);
    }
    private void addFunction(){
        //添加具体的职责
    }
    @Override
    public void opertion() {
        //调用本类中用于添加职责的方法
        this.addFunction();
        //再调用父类目前已具备的功能
        super.opertion();
    }
}