package com.adi.proxy_pattern.virtual_proxy;

import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
        Picture p = new VirtualProxy();
        p.download();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
