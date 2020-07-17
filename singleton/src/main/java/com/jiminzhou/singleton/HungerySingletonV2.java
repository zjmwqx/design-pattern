package com.jiminzhou.singleton;

public class HungerySingletonV2 {
    private HungerySingletonV2(){}
    private static HungerySingletonV2 hungerySingletonV1 = null;
    static {
        hungerySingletonV1 = new HungerySingletonV2();
    }
    public static HungerySingletonV2 getInstance() {
        return hungerySingletonV1;
    }
}
