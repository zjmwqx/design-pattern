package com.jiminzhou.singleton;

public class LazySingletonV2 {
    private LazySingletonV2(){}
    private static LazySingletonV2 lazySingletonV2= null;
    public static synchronized LazySingletonV2 getInstance() {
        if(lazySingletonV2 == null){
            lazySingletonV2 = new LazySingletonV2();
        }
        return lazySingletonV2;
    }
}
