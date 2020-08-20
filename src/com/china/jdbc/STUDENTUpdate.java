package com.china.jdbc;

import com.china.jdbc.utils.DBUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Eric Lee
 * @date 2020/8/20 21:01
 */
public class STUDENTUpdate {
    public static void main(String[] args) throws SQLException {
        Connection connection = DBUtils.getConnection();
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate("update student set score = 100 where id= 3 ");
        if (count>0)
            System.out.println("更新成功！");
        else
            System.out.println("更新失败！");
        DBUtils.close(statement, connection);


    }
}
