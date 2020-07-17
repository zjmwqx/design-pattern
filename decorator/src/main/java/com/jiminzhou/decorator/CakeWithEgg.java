package com.jiminzhou.decorator;

public class CakeWithEgg extends Cake {
    private Cake cake;

    public CakeWithEgg(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getContent() {
        return cake.getContent()+"，1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return cake.getPrice() + 1;
    }
}
