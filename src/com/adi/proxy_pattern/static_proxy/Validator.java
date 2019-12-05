package com.adi.proxy_pattern.static_proxy;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

public class Validator {

    private static String pwd = null;

    public static void setPwd(String pwd) {
        Validator.pwd = pwd;
    }

    public static byte[] decrypt(byte[] encryptData) {
        byte[] bytes = null;
        SecureRandom secureRandom = new SecureRandom();
        try {
            DESKeySpec desKeySpec = new DESKeySpec(pwd.getBytes());
            SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = factory.generateSecret(desKeySpec);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE,secretKey,secureRandom);
            bytes = cipher.doFinal(encryptData);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return bytes;
    }
}
