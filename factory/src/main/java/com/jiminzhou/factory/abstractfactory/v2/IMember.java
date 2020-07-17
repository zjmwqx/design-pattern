package com.jiminzhou.factory.abstractfactory.v2;

public interface IMember {
    void add();
    void get(String id);
    class MysqlMember implements IMember {

        @Override
        public void add() {
            System.out.println("mysql添加会员成功");
        }

        @Override
        public void get(String id) {
            System.out.println("mysql查询会员" + id + "成功");
        }
    }
    class OracleMember implements IMember {

        @Override
        public void add() {
            System.out.println("oracle添加会员成功");
        }

        @Override
        public void get(String id) {
            System.out.println("oracle查询会员" + id + "成功");
        }
    }
}
