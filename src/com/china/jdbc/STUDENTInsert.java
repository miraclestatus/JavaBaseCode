package com.china.jdbc;

import com.china.jdbc.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Eric Lee
 * @date 2020/8/20 20:57
 */
public class STUDENTInsert {
    public static void main(String[] args) throws SQLException {
        Connection conn = DBUtils.getConnection();

        Statement stmt = conn.createStatement();

        String sql = "insert into student values (null, '小鲁班', 49)";
        int count = stmt.executeUpdate(sql);
        if (count > 0){
            System.out.println("插入成功！");
        }else {
            System.out.println("插入失败");
        }
        DBUtils.close(stmt, conn);


    }
}
