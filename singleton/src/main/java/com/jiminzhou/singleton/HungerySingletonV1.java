package com.jiminzhou.singleton;

public class HungerySingletonV1 {
    private HungerySingletonV1(){}
    private static HungerySingletonV1 hungerySingletonV1 = new HungerySingletonV1();
    public static HungerySingletonV1 getInstance() {
        return hungerySingletonV1;
    }
}
