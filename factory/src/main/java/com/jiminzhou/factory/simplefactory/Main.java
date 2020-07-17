package com.jiminzhou.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        IFruit apple = FruitFactory.provide("apple");
        IFruit banana = FruitFactory.provide("banana");
        IFruit watermallen = FruitFactory.provide("watermallen");
        apple.taste();
        banana.taste();
        watermallen.taste();
    }
}
