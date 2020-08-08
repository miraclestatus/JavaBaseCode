package com.china.day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/8/8 17:03
 */
public class  WordCount {
    public static void main(String[] args) {
        // 在控制中输入一系列的字符串对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一系列字符串"); // dadasdasdewqd
        String s = scanner.next();
        findCharCount(s);
    }

    private static void findCharCount(String s) {
        // 创建一个hashmap用于存储 单词出现的次数， { d ：4, a:56}
        // 将传入的字符串s进行遍历
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            // 判断map里面是否有该字符
            if (!map.containsKey(c)){
                // map中不包含这个键， 说明之前没有这个字符
                // 也就是没有出现这个字符， 就是第一次
                map.put(c, 1);
            }else {
                // 先获取这个字符出现的次数
                Integer count = map.get(c); // 5
                // 将count值再加一次
                map.put(c, ++count);
            }


        }

        System.out.println(map);
    }

}
