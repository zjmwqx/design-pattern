package com.jiminzhou.factory.factorymethod;

public class Main {
    public static void main(String[] args) {
        IFactory ff = new AppleFactory();
        IFruit apple = ff.create();
        apple.taste();
    }
}
