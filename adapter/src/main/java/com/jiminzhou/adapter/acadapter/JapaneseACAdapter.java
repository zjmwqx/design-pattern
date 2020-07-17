package com.jiminzhou.adapter.acadapter;

public class JapaneseACAdapter implements ACAdapter {
    private static final int voltage = 110;
    @Override
    public boolean support(AC ac) {
        return ac.outputAC() == voltage;
    }

    @Override
    public int outputDC5V(AC ac) {
        return ac.outputAC()/22;
    }
}
