package com.china.day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/8/4 20:07
 */
public class Demo5 {
    public static void main(String[] args) throws ParseException {
        // 编写一个方法，获取当月的最后一天的日期
        String day = getLastDayOfMonth1("2020-02");
        System.out.println("2020-02 -" + day);
        String day1 = getLastDayOfMonth2(2020, 02);
        System.out.println(day1);
    }
    // 方法一：
    public static String getLastDayOfMonth1(String yearMonth) throws ParseException {
        // yyyy-MM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date date = sdf.parse(yearMonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return ""+ lastDay;
    }
    // 方法二：
    public static String getLastDayOfMonth2(int year, int month) throws ParseException {
        // yyyy-MM
        Calendar calendar = Calendar.getInstance();
        calendar.clear();// 清除日期数据
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return ""+ lastDay;
    }
}

