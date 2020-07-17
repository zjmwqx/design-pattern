package com.jiminzhou.template.jdbc;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
        MemberDao memberDao = new MemberDao(null);
        List rs = memberDao.selectAll();
    }
}
