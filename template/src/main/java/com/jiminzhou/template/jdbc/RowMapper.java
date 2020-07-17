package com.jiminzhou.template.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
    T map(ResultSet rs, int rowNum) throws SQLException;
}
