package com.adi.proxy_pattern;

public class StandardProxyPattern {
}


interface Subject {
    void operation();
}

class RealSubject implements Subject {
    @Override
    public void operation() {
        //具体业务操作
    }
}
class Proxy implements Subject{

    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    private void pre() {
        //代理业务操作前要做的事情
    }
    private void post() {
        //代理业务操作后要做什么
    }
    @Override
    public void operation() {
        this.pre();
        realSubject.operation();
        this.post();
    }
}