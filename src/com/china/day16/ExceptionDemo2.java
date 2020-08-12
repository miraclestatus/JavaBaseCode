package com.china.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/8/12 17:16
 */
public class ExceptionDemo2 {
    public static void main(String[] args) throws ParseException {
//        修饰符 <代表泛型的变量> 返回值类型 方法名(参数列表) throws 异常类1， 异常类2 {
//        }
        timeFormat("2020-08");

    }

    public static void timeFormat(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(str);
        System.out.println(date);
    }
}
