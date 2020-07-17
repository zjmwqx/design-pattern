package com.jiminzhou.factory.factorymethod;

public class OrangeFactory implements IFactory{
    @Override
    public IFruit create() {
        return new Orange();
    }
}
