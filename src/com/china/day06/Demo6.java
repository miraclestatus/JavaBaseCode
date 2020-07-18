package com.china.day06;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/18 11:32
 * // 键盘录入一个字符串
 * 统计字符串中大小写字母及数字字符个数
 */
public class Demo6 {
    public static void main(String[] args) {
        // 键盘录入数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串数据");
        String s = scanner.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        // 遍历字符串 dsajdsa
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            //
            if (ch>= 'A' && ch <='Z'){
                // 记录大写字符个数
                bigCount++;
            }else if (ch>= 'a' && ch <='z'){
                // 记录小写字符个数
                smallCount++;
            }else if(ch>= '0' && ch <='9') {
                // 数字
                numberCount++;
            }else {
                System.out.println("该字符"+ch+"非法");
            }


        }
        System.out.println("bigCount"+bigCount);
    }
}
