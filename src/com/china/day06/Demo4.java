package com.china.day06;

/**
 * @author Eric Lee
 * @date 2020/7/18 11:02
 */
public class Demo4 {
    public static void main(String[] args) {
        // 获取功能的方法
        String s = "helloworld";
        // 获取字符串的长度
        System.out.println(s.length());
        System.out.println("+++++++++++++++++++");
        // concat 将指定的字符串连接到字符串的末尾
        String s2 = s.concat("**tinagaryjarvis");
        System.out.println(s2);
        System.out.println("+++++++++++++++++++");
        // 获取指定索引处的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println("+++++++++++++++++++");
        // indexOf() 获取str 第一次出现的索引 没有返回 -1
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("owo"));
        System.out.println(s.indexOf("oak"));
        System.out.println("+++++++++++++++++++");
        //  从start开始截取字符串到字符串的结尾
        // helloworld
        System.out.println(s.substring(0));
        System.out.println(s.substring(5));
        System.out.println("+++++++++++++++++++");
        //  从start开始截取字符串到end的尾  ， 左闭右开
        System.out.println(s.substring(0, s.length()));
        System.out.println(s.substring(3, 8));


    }
}
