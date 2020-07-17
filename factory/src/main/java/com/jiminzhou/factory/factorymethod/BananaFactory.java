package com.jiminzhou.factory.factorymethod;

public class BananaFactory implements IFactory{
    @Override
    public IFruit create() {
        return new Banana();
    }
}
