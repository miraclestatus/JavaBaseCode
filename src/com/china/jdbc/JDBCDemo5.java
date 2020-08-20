package com.china.jdbc;

import java.sql.*;

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
        String sql = "select  *  from emp";
        // 执行查询的时候返回一个ResultSet对象
        // 这个结果集对象 是一个集合我们需要遍历它
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            int empno = rs.getInt(1);
            String ename = rs.getString(2);
            String job = rs.getString(3);
            int mgr = rs.getInt(4);
            Date date = rs.getDate(5);
            int sal = rs.getInt(6);
            int comm = rs.getInt(7);
            int deptno = rs.getInt(8);

            System.out.print(empno);
            System.out.print("\t");
            System.out.print(ename);
            System.out.print("\t");
            System.out.print(mgr);
            System.out.print("\t");
            System.out.print(date);
            System.out.print("\t");
            System.out.print(sal);
            System.out.print("\t");
            System.out.print(deptno);
            System.out.print("\t");
            System.out.print(comm);
            System.out.print(job);

            System.out.println();
        }






        // 释放资源
        stmt.close();
        conn.close();
        rs.close();
//

    }
}
