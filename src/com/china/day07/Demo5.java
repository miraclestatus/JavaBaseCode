package com.china.day07;

import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/7/20 20:46
 */
public class Demo5 {
    public static void main(String[] args) {
        String line = "dsadsadsadBUYGYHUHU";

        // 将字符串所有字符升序排序， 并倒序打印
        char[] chars = line.toCharArray();
        // 升序排序
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i] + " " );
        }
    }
}
