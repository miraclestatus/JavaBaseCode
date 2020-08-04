package com.china.day13;

/**
 * @author Eric Lee
 * @date 2020/8/4 20:55
 */
public class Demo8 {
    public static void main(String[] args) {
        // "123"  ___> 123
        int a = 100;
        String b = "" + a;
        System.out.println(b instanceof String);
        // 将字符串转化为数字
        int i = Integer.parseInt(b);
        System.out.println(i + 100);
        // 方法二
        Integer integer = Integer.valueOf("120");
        System.out.println(integer);
    }
}
