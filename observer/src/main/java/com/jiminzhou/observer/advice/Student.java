package com.jiminzhou.observer.advice;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Boarder bd = (Boarder)o;
        ActivityMessage msg = (ActivityMessage)arg;
        System.out.println("get msg:" + msg.getContent());
    }
}
