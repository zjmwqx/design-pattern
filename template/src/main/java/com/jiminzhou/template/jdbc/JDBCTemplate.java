package com.jiminzhou.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCTemplate {
    public JDBCTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private DataSource dataSource;
    public List<?> excuteQuery(String sql, RowMapper<?> rowMapper, Object[] values ) throws SQLException {
        Connection con = dataSource.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        for(int i = 0; i < values.length; ++i) {
            ps.setObject(i, values[i]);
        }
        ResultSet rs = ps.executeQuery();
        List<Object> ret = new ArrayList<>();
        int rowNum = 1;
        while(rs.next()) {
            ret.add(rowMapper.map(rs, rowNum++));
        }
        ps.close();
        con.close();
        return ret;
    }
}
