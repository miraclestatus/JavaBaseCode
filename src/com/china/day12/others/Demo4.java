package com.china.day12.others;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/8/3 20:26
 */
public class Demo4 {
    public static void main(String[] args) {
        // 日期格式化类 simpledateformat 类
        // 我们经常会看到一些不同的日期格式

        // 2020-08-03 2020年08月03日， 如何转化这些日期格式呢？
       DateFormat sdf =  new SimpleDateFormat("yyyy年MM月dd日");
       DateFormat sdf2 =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(date); // Mon Aug 03 20:09:06 CST 2020
        String s = sdf.format(date);
        System.out.println(s);
        String s1 = sdf2.format(date);
        System.out.println(s1);
    }
}
