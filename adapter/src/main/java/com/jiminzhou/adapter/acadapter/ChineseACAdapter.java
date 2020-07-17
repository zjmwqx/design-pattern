package com.jiminzhou.adapter.acadapter;

public class ChineseACAdapter implements ACAdapter{
    private static final int voltage = 220;
    @Override
    public boolean support(AC ac) {
        return ac.outputAC() == voltage;
    }

    @Override
    public int outputDC5V(AC ac) {
        return ac.outputAC()/44;
    }
}
