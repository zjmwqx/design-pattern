package com.jiminzhou.singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.staticInnerClassSingleton;
    }
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
}
