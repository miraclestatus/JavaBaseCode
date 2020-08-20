package com.china.jdbc.utils;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Eric Lee
 * @date 2020/8/20 20:15
 */
public class DBUtils {
    // 定义成员变量
    private static DataSource ds;
    // 通过静态代码块进行初始化
    static {
        try {
            // 加载配置文件，用配置文件去读取代码
            Properties pro = new Properties();
            pro.load(DBUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            // 初始化ds对象
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 获取连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    // 编写释放资源的代码
    // update insert delete 时候只要关闭两个
    public static void close(Statement stmt, Connection conn){
        close(null, stmt, conn);
    }

    public static void close(ResultSet rs , Statement stmt, Connection conn){

        // 做 空判断
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }








}
