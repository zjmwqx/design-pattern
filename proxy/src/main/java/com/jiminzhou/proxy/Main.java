package com.jiminzhou.proxy;

public class Main {
    public static void main(String[] args) {
//        Ticket ticket = new StaticProxyBuy();
//        ticket.buyTicket();

//        Ticket ticket1 = (Ticket)new DynProxy().getInstance(new TrainStation());
//        ticket1.buyTicket();
        Ticket ticket = (Ticket) new CGLIBProxy().getInstance(new TrainStation());
        ticket.buyTicket();
    }
}
