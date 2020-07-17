package com.jiminzhou.singleton;

public class LazySingletonV1 {
    private LazySingletonV1(){}
    private static LazySingletonV1 lazySingletonV1= null;
    public static LazySingletonV1 getInstance() {
        if(lazySingletonV1 == null){
            lazySingletonV1 = new LazySingletonV1();
        }
        return lazySingletonV1;
    }
}
