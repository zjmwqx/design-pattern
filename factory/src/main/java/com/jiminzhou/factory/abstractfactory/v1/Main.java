package com.jiminzhou.factory.abstractfactory.v1;

public class Main {
    public static void main(String[] args) {
        IDriverFactory mysqlDriver = new IDriverFactory.MysqlDriverFactory();
        IJoinLog log = mysqlDriver.IJoinLogFactory();
        IMember member = mysqlDriver.IMemberFactory();
        log.add();
        log.get("1");
        member.add();
        member.get("1");
    }
}
