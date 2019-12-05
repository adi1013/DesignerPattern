package com.adi.proxy_pattern.static_proxy;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.SecureRandom;

public class GrantAuthorization {

    private static String pwd = null;

    public static void setPwd(String pwd) {
        GrantAuthorization.pwd = pwd;
    }

    public static byte[] encrypt(byte[] dataSource) {
        byte[] bytes = null;
        SecureRandom secureRandom = new SecureRandom();
        try {
            DESKeySpec desKeySpec = new DESKeySpec(pwd.getBytes());
            SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
            SecretKey key = factory.generateSecret(desKeySpec);//密钥
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, key, secureRandom);
            bytes = cipher.doFinal(dataSource);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return bytes;
    }

}
