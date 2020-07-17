package com.jiminzhou.proxy;

public class StaticProxyBuy implements Ticket{
    private TrainStation trainStation;
    public void buyTicket(){
        if(trainStation == null) {
            trainStation = new TrainStation();
        }
        //before
        trainStation.buyTicket();
        //after
        System.out.println("第三方平台购票成功");
    }
}
