package com.china.day13;

/**
 * @author Eric Lee
 * @date 2020/8/4 20:38
 */
public class Demo7 {
    public static void main(String[] args) {
        // StringBuilder 类
        //  由于 String具有不可变， 如果对于同一字符串，我们频繁的进行拼接操作，
        // 就会造成系统资源的极大浪费
        // 使用
        StringBuilder sb = new StringBuilder("I");
//        System.out.println(sb);
//        StringBuilder sb2 = sb.append(" Like");
//        System.out.println(sb2);
//        StringBuilder sb3 = sb.append(" Java");
//        System.out.println(sb3);
//        StringBuilder sb4 = sb.append(8);
//        System.out.println(sb4);
//        System.out.println(sb==sb2);

        StringBuilder builder = sb.append(" Like").append(" Java").append(8);
        System.out.println(builder);

    }
}
