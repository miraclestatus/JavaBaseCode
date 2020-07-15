package com.china.day05;

import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/7/15 15:58
 */
public class Demo2 {
    public static void main(String[] args) {
        // Random类
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            // 生成一个 [0, n) 的随机整数
           int number  =  random.nextInt(10) + 1;
            System.out.println(number);

        }
    }
}
