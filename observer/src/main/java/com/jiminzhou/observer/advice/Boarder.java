package com.jiminzhou.observer.advice;

import java.util.Observable;

public class Boarder extends Observable {
    public void publishMsg(ActivityMessage msg) {
        setChanged();
        notifyObservers(msg);
    }
}
