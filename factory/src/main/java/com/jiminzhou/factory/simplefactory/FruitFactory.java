package com.jiminzhou.factory.simplefactory;

public class FruitFactory {
    public static IFruit provide(String fruitName) {
        switch (fruitName) {
            case "apple": return new AppleImpl();
            case "banana": return new BananaImpl();
            case "watermallen": return new WaterMallenImpl();
        }
        throw new RuntimeException("暂时没这种口味的哦");
    }
}
