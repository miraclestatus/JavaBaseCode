package com.china.day08.luckymoney;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/22 17:42
 */
public class Test {
    public static void main(String[] args) {
        QunZhu qunZhu = new QunZhu("群主", 200);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = scanner.nextInt();
        System.out.println("请输入发几个红包");
        int count = scanner.nextInt();
        // 发红包方法
    }
}
