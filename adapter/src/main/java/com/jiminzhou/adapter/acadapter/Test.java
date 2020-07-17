package com.jiminzhou.adapter.acadapter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private List<ACAdapter> adapterList = new ArrayList<ACAdapter>();
    public Test() {
        this.adapterList.add(new ChineseACAdapter());
        this.adapterList.add(new JapaneseACAdapter());
    }
    public ACAdapter findPowerAdapter(AC ac) {
        for(ACAdapter acAdapter:adapterList) {
            if(acAdapter.support(ac)) {
                return acAdapter;
            }
        }
        throw new IllegalArgumentException("没有找到合适的变压适配器");
    }
    public static void main(String[] args) {
        Test test = new Test();
        AC220 chinaAC = new AC220();
        ACAdapter adapter = test.findPowerAdapter(chinaAC);
        adapter.outputDC5V(chinaAC);
    }
}
