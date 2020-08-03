package com.china.day12.others;

import java.util.Calendar;

/**
 * @author Eric Lee
 * @date 2020/8/3 20:43
 */
public class Demo5 {
    public static void main(String[] args) {
        // calendar 日历类 比date更为常用
        // 创建一个 Calendar类
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // 获取指定的年
        int year = calendar.get(Calendar.YEAR);
        // 获取指定的月 (0~11)共12月
        int month = calendar.get(Calendar.MONTH)+1;
        // 获取指定的日
        int day =  calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year  + "年" + month +"月" +day+ "日");
    }
}
