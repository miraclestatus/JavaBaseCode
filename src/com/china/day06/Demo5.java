package com.china.day06;

/**
 * @author Eric Lee
 * @date 2020/7/18 11:19
 */
public class Demo5 {
    public static void main(String[] args) {
        // 转换功能的方法
        String s  = "abcde";
        // toCharArray() 把字符串变成字符数组
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str = "tinagaryjarvis";
        String replace = str.replace("t", "T");
        System.out.println(replace);
        // 分割功能
//        String ss = "aa/bb/cc";
        String ss = "aa/bb/cc";
        String[] splitarray = ss.split("/"); // [aa,bb,cc]
//        System.out.println(splitarray);
        for (int i = 0; i < splitarray.length; i++) {
            System.out.print("\t"+splitarray[i]);
        }
    }
}
