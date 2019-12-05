package com.adi.proxy_pattern.static_proxy;


public class ServiceProxy implements Service{

    private Service service;

    public ServiceProxy(Service service) {
        this.service = service;
    }

    @Override
    public String request(byte[] encryptData) {
        String res = null;
        if (doValid(encryptData)) {
            byte[] plainText = service.request(encryptData).getBytes();
            res = new String(plainText);
        } else {
            res = "error";
        }
        return res;
    }

    private boolean doValid(byte[] encryptData){
        String decrypt = new String(Validator.decrypt(encryptData));
        return decrypt.equals("helloworld");
    }
}
