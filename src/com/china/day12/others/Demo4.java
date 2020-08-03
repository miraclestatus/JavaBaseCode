package com.china.day12.others;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/8/3 20:26
 */
public class Demo4 {
    public static void main(String[] args) throws ParseException {
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
        // format 将date类型转化为指定的字符串类型
        // 那么如何将字符串的日期形式转化成 date类型呢
        // parse 方法进行解析
        String str = "2008年08月08日";
        // 将str转化成时间类型
        DateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日");
        Date date1 = sdf3.parse(str);
        System.out.println(date1); // Fri Aug 08 00:00:00 CST 2008
        //  日期转化成字符串使用  SimpleDateFormat(字符串格式).format(目标字符串)
        // 字符串 转化日期   SimpleDateFormat(日期格式).parse(date类型)



    }
}
