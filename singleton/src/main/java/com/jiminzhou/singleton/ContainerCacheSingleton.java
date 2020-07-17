package com.jiminzhou.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerCacheSingleton {
    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();
    public static Object getInstance(String className) {
        synchronized (ioc) {
            try {
                if(!ioc.containsKey(className)){
                    ioc.put(className, Class.forName(className).newInstance());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            ioc.get(className);
        }
        return ioc.get(className);
    }
}
