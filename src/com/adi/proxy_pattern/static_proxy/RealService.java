package com.adi.proxy_pattern.static_proxy;

public class RealService implements Service {

    @Override
    public String request(byte[] encryptData) {
        return "请求成功";
    }
}
