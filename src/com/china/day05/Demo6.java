package com.china.day05;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/15 17:01
 */
public class Demo6 {
    public static void main(String[] args) {
        // 生成 num（控制台输入）个 1~33之间的随机整数，添加到集合中，并且遍历输出
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入num的值");
        int num = scanner.nextInt();
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num ; i++) {
           int r =  random.nextInt(33)+1;
           list.add(r);
        }
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
