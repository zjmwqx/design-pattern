package com.jiminzhou.factory.factorymethod;

public class AppleFactory implements IFactory{
    @Override
    public IFruit create() {
        return new Apple();
    }
}
