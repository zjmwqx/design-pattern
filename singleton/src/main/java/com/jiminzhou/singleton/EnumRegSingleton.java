package com.jiminzhou.singleton;

public enum EnumRegSingleton {
    INSTANCE;

    private EnumRegSingleton(){}
    private Object object;
    public Object get() {
        return object;
    }
    public void set(Object obj) {
        object = obj;
    }
    public static EnumRegSingleton getInstance(){
        return INSTANCE;
    }
}
