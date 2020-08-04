package com.china.day13;

import java.util.Calendar;

/**
 * @author Eric Lee
 * @date 2020/8/4 19:57
 */
public class Demo3 {
    public static void main(String[] args) {
        // calender的add方法
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // 获取指定的年
        int year = calendar.get(Calendar.YEAR);
        // 获取指定的月 (0~11)共12月
        int month = calendar.get(Calendar.MONTH)+1;
        // 获取指定的日
        int day =  calendar.get(Calendar.DAY_OF_MONTH);
        // 在原来天数的基础上加 2天
        calendar.add(calendar.DAY_OF_MONTH, 10);
        calendar.add(calendar.YEAR, -7);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        year = calendar.get(Calendar.YEAR);
        System.out.println("增加后的天数"+ year  + "年" + month +"月" +day+ "日");

    }
}
