package com.china.day06;

/**
 * @author Eric Lee
 * @date 2020/7/18 10:57
 */
public class Demo3 {
    public static void main(String[] args) {
        // 将此字符与指定字符串进行比较
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "HELLO";
        // public boolean equals(Object anObject) :比较字符串内容是否相同
        System.out.println(s1.equals(s2));//true

        System.out.println(s1.equals(s3)); // false

        System.out.println(s1.equalsIgnoreCase(s2)); // 忽略大小写比较
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
