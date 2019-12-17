package com.adi.proxy_pattern.cache_proxy;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private final static Map<Object, Object> tmpMap = new HashMap<>();

    public synchronized static void add(Object key, Object val) {
        tmpMap.put(key, val);
    }

    public static Object get(Object key) {
        if (tmpMap.containsKey(key)) {
            return tmpMap.get(key);
        }
        return null;
    }
}
