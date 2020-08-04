package com.china.day13;

import java.util.Calendar;

/**
 * @author Eric Lee
 * @date 2020/8/4 19:43
 */
public class Demo2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // set 方法
        int year = calendar.get(Calendar.YEAR);
        // 获取指定的月 (0~11)共12月
        int month = calendar.get(Calendar.MONTH)+1;
        // 获取指定的日
        int day =  calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year  + "年" + month +"月" +day+ "日");
        // 修改年份
//        calendar.set(calendar.YEAR, 2008,11);
        calendar.set(2008, 11, 04);
        // 修改完要重新get一下
        year = calendar.get(calendar.YEAR);
        month = calendar.get(calendar.MONTH);
        day = calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(year  + "年" + month +"月" +day+ "日");
        // 修改月份


    }
}
