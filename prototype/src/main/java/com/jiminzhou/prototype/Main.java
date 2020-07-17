package com.jiminzhou.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Form fm = new Form();
        Form fm1 = (Form)fm.clone();
        DeepForm df = new DeepForm();
        DeepForm dfm1 = (DeepForm)df.clone();
        System.out.println(fm1 == fm);
        System.out.println(df == dfm1);
    }
}
