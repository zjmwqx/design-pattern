package com.jiminzhou.proxy;

public class Test {
    private String aa;
    private Integer bb;

    public Test(String aa, Integer bb) {
        this.aa = aa;
        this.bb = bb;
    }

    @Override
    public String toString() {
        return "Test{" +
                "aa='" + aa + '\'' +
                ", bb=" + bb +
                '}';
    }
}
