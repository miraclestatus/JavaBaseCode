package com.china.day12.others;

import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/8/3 20:05
 */
public class Demo3 {
    public static void main(String[] args) {
        // 在java中我们使用 Date类作为时间格式的应用类
        // 创建日期对象，返回当前的日期
        Date date = new Date();
        // 输出这个对象 输出当前时区的时间
        System.out.println(date);
        // Mon Aug 03 20:09:06 CST 2020
        // 初始化时间对象, 表示标准基准时间， 1970年1月1日 00：00：00 格林威治
        Date date1 = new Date(0L);
        System.out.println(date1); // Thu Jan 01 08:00:00 CST 1970

        // 常用方法 getTime , 返回自基准时间到现在的总共毫秒数
        System.out.println(new Date().getTime());


    }
}
