package com.jiminzhou.adapter.classadapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        adapteeRequest();
    }
}
