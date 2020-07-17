package com.jiminzhou.singleton;

public class Main {
    public static void main(String[] args) {
        EnumRegSingleton obj = EnumRegSingleton.getInstance();
        EnumRegSingleton obj2 = EnumRegSingleton.getInstance();
        obj.set(new String("11"));
        obj2.set(new String("12"));
        System.out.println(obj.get().hashCode());
        System.out.println(obj2.get().hashCode());
    }
}
