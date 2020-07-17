package com.jiminzhou.strategy.pay;

public class MsgResult {
    private int retCode;
    private Object data;
    private String msg;

    public MsgResult(int retCode, Object data, String msg) {
        this.retCode = retCode;
        this.data = data;
        this.msg = msg;
    }
}
