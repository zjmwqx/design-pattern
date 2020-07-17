package com.jiminzhou.template.jdbc;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberDao {
    private JDBCTemplate jdbcTemplate = null;
    public MemberDao(DataSource ds) {
        jdbcTemplate = new JDBCTemplate(ds);
    }
    public List<?> selectAll() throws SQLException {
        String sql = "select * from t_member";
        return jdbcTemplate.excuteQuery(sql, new RowMapper<Member>() {
            @Override
            public Member map(ResultSet rs, int rowNum) throws SQLException {
                Member member = new Member();
                //字段过多，原型模式
                member.setName(rs.getString("username"));
                member.setAddress(rs.getString("addr"));
                return member;
            }
        }, null);
    }

}
