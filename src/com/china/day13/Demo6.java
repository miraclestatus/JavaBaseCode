package com.china.day13;

/**
 * @author Eric Lee
 * @date 2020/8/4 20:27
 */
public class Demo6 {
    public static void main(String[] args) {
        // System类
        // 获取当前系统时间与1970年1月1日之间的毫秒数
//        long currentTimeMillis = System.currentTimeMillis();// 1596544168680
//        System.out.println(currentTimeMillis);
        // 练习：计算，某些代码的运行时间
        long start = System.currentTimeMillis();
        for (int i = 0; i <999999 ; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000 + "秒");




    }
}
