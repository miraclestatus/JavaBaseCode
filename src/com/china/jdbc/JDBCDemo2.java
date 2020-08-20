package com.china.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Eric Lee
 * @date 2020/8/19 17:17
 */
public class JDBCDemo2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 和数据库取得链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garyjarvis","root", "root");
        // 获取执行sql 的对象 Statement
        Statement stmt = conn.createStatement();
        // 定义sql
        String sql = "update student set score= 6 where id = 3";
        // 执行sql   count 是受影响的行数
        int count = stmt.executeUpdate(sql);

        System.out.println("受影响的行数" +count);
        // 释放资源
        stmt.close();
        conn.close();
//

    }
}
