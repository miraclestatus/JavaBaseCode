package com.china.day06;

/**
 * @author Eric Lee
 * @date 2020/7/18 10:04
 * String类
 */
public class Demo1 {
    public static void main(String[] args) {
        String s1 = "eric";  // 特点 ：字符串不变，字符串在创建后不能被更改
//        s1 += "d";
//        String s2 = s1 + "d";
        System.out.println(s1);
        String s2 =  "eric";
        System.out.println(s2);
        //
        String str = "abc";
        // 相当于
        char[] data = {'a', 'b', 'c'};
        //     char data[] = {'a', 'b', 'c'};

        String s = new String(data); // data作为参数传入了构造函数中
        System.out.println(s);  // 包名. at 地址

    }
}
