package com.jiminzhou.factory.simplefactory;

public class AppleImpl implements IFruit {
    @Override
    public void taste() {
        System.out.println("苹果");
    }
}
