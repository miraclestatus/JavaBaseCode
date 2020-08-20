package com.china.jdbc;

import com.china.jdbc.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/8/20 21:24
 */
public class CMS {
    public static void main(String[] args) throws SQLException {
        System.out.println("欢迎使用CMS系统");
        int menu = 0;
        while (menu != 5){
            System.out.println("========= 1.所有学生列表=2.新增学生成绩=3.修改学生成绩=4.退出系统");
            System.out.println("请选择编号");
            menu = new Scanner(System.in).nextInt();
            switch (menu){
                case 1:
                    queryStudent();
                    break;
                case 2:
                    insertStudent();
                    break;
                case 3:
                    updateStudent();
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("欢迎下次使用");
                    break;
                default:
                    System.out.println("输入错我要");
            }
        }
    }

    public static void  queryStudent() throws SQLException {
        Connection conn = DBUtils.getConnection();

        Statement stmt = conn.createStatement();
        String sql = "select  * from student";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            int score = rs.getInt(3);
            System.out.print(id);
            System.out.print("\t");
            System.out.print(name);
            System.out.print("\t");
            System.out.print(score);

            System.out.println();
        }

    }
    public static void insertStudent() throws SQLException {
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
    public static void updateStudent() throws SQLException {
        Connection connection = DBUtils.getConnection();
        Statement statement = connection.createStatement();
        int count = statement.executeUpdate("update student set score = 200 where id= 3 ");
        if (count>0)
            System.out.println("更新成功！");
        else
            System.out.println("更新失败！");
        DBUtils.close(statement, connection);

    }
    public static void deleteStudent() throws SQLException {
        Connection conn = DBUtils.getConnection();

        Statement stmt = conn.createStatement();

        String sql = "delete from student where id = 9 ";
        int count = stmt.executeUpdate(sql);
        if (count > 0){
            System.out.println("插入成功！");
        }else {
            System.out.println("插入失败");
        }
        DBUtils.close(stmt, conn);

    }



}
