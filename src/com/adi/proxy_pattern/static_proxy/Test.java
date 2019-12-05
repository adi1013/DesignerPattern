package com.adi.proxy_pattern.static_proxy;

public class Test {

    public static void main(String[] args) {
        String pwd = "wertsadfnhuijkloghjutfsdmthuhubv4957~123?><';p[u[!@#$%^&*KHKHKHR";
        GrantAuthorization.setPwd(pwd);
        Validator.setPwd(pwd);

        Service realService = new ServiceProxy(new RealService());
        String s = realService.request(GrantAuthorization.encrypt("hell".getBytes()));
        System.out.println(s);
    }
}
