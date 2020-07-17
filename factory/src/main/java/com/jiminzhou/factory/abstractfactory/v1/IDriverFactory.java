package com.jiminzhou.factory.abstractfactory.v1;

public interface IDriverFactory {
    IMember IMemberFactory();
    IJoinLog IJoinLogFactory();

    class MysqlDriverFactory implements IDriverFactory{

        @Override
        public IMember IMemberFactory() {
            return new IMember.MysqlMember();
        }

        @Override
        public IJoinLog IJoinLogFactory() {
            return new IJoinLog.MysqlJoinLog();
        }
    }
    class OracleDriverFactory implements IDriverFactory{

        @Override
        public IMember IMemberFactory() {
            return new IMember.OracleMember();
        }

        @Override
        public IJoinLog IJoinLogFactory() {
            return new IJoinLog.OracleJoinLog();
        }
    }
}
