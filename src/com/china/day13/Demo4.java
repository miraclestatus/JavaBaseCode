package com.china.day13;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/8/4 20:04
 */
public class Demo4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 返回一个calendar的时间值
        Date date = calendar.getTime();
        System.out.println(date);
        // 等价于
        Date date1 = new Date();
        System.out.println(date1);
    }
}
