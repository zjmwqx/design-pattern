package com.jiminzhou.observer.advice;

public class Test {
    public static void main(String[] args) {
        Boarder bd = new Boarder();
        Student st1 = new Student();
        bd.addObserver(st1);
        bd.publishMsg(new ActivityMessage("jajajaa"));

    }
}
