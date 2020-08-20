package com.china.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Eric Lee
 * @date 2020/8/19 17:17
 * 查询
 */
public class JDBCDemo5 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 和数据库取得链接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/garyjarvis","root", "root");
        // 获取执行sql 的对象 Statement
        Statement stmt = conn.createStatement();
        // 定义sql
        String sql = "delete from dept where deptno=80";
        // 执行sql   count 是受影响的行数
        int count = stmt.executeUpdate(sql);

        if (count >0 ){
            System.out.println("删除成功！");
        }else {
            System.out.println("删除失败！");
        }
        // 释放资源
        stmt.close();
        conn.close();
//

    }
}
