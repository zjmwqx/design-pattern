package com.jiminzhou.decorator;

public class Test {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake = new CakeWithEgg(cake);
        cake = new CakeWithEgg(cake);
        cake = new CakeWithEgg(cake);
        System.out.println(cake.getContent());
        System.out.println(cake.getPrice());
    }
}
