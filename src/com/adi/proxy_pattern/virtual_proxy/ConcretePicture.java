package com.adi.proxy_pattern.virtual_proxy;

public class ConcretePicture implements Picture {


    @Override
    public void show() {
        System.out.println("显示真实图像");
    }

    @Override
    public void download() {
        System.out.println("下载");
    }
}
