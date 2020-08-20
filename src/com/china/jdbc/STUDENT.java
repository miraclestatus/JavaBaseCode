package com.china.jdbc;

import com.china.jdbc.utils.DBUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Eric Lee
 * @date 2020/8/20 20:36
 */
public class STUDENT {
    public static void main(String[] args) throws SQLException {
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
}
