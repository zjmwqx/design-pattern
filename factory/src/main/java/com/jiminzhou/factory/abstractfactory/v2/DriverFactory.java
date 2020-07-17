package com.jiminzhou.factory.abstractfactory.v2;

public class DriverFactory {

    private static String db = "mysql";
    public IMember IMemberFactory() {
        if(db == "mysql") {
            return new IMember.MysqlMember();

        } else if(db == "oracle") {
            return new IMember.OracleMember();
        }
        throw new RuntimeException("数据库不支持");
    }

    public IJoinLog IJoinLogFactory() {
        if(db == "mysql") {
            return new IJoinLog.MysqlJoinLog();

        } else if(db == "oracle") {
            return new IJoinLog.OracleJoinLog();
        }
        throw new RuntimeException("数据库不支持");
    }

}
