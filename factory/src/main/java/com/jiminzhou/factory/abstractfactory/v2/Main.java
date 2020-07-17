package com.jiminzhou.factory.abstractfactory.v2;

public class Main {
    public static void main(String[] args) {
        DriverFactory mysqlDriver = new DriverFactory.MysqlDriverFactory();
        IJoinLog log = mysqlDriver.IJoinLogFactory();
        IMember member = mysqlDriver.IMemberFactory();
        log.add();
        log.get("1");
        member.add();
        member.get("1");
    }
}
