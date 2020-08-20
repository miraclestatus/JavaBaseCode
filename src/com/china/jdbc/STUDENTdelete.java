package com.china.jdbc;

import com.china.jdbc.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Eric Lee
 * @date 2020/8/20 21:05
 */
public class STUDENTdelete {
    public static void main(String[] args) throws SQLException {
            Connection conn = DBUtils.getConnection();

            Statement stmt = conn.createStatement();

            String sql = "delete from student where id = 8 ";
            int count = stmt.executeUpdate(sql);
            if (count > 0){
                System.out.println("插入成功！");
            }else {
                System.out.println("插入失败");
            }
            DBUtils.close(stmt, conn);


        }

}
