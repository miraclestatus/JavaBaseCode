package com.china.jdbc;

import java.sql.*;

/**
 * @author Eric Lee
 * @date 2020/8/19 17:17
 */
public class JDBCDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 和数据库取得链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garyjarvis","root", "root");
        // 获取执行sql 的对象 Statement
        Statement stmt = conn.createStatement();
        // 定义sql  往 student 表中插入一条数据
        String sql = "insert into student values(null, '张飞', 200)";
        // 执行sql   count 是受影响的行数
        int count = stmt.executeUpdate(sql);

        if (count >0 ){
            System.out.println("添加成功！");
        }else {
            System.out.println("添加失败！");
        }
        // 释放资源
        stmt.close();
        conn.close();
//

    }
}
