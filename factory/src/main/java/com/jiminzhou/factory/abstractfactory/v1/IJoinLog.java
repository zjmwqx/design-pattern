package com.jiminzhou.factory.abstractfactory.v1;

public interface IJoinLog {
    void get(String id);
    void add();
    class MysqlJoinLog implements IJoinLog{

        @Override
        public void get(String id) {
            System.out.println("mysql获取日志成功");
        }

        @Override
        public void add() {
            System.out.println("mysql添加日志成功");
        }
    }
    class OracleJoinLog implements IJoinLog{

        @Override
        public void get(String id) {
            System.out.println("oracle获取日志成功");
        }

        @Override
        public void add() {
            System.out.println("oracle添加日志成功");
        }
    }
}
