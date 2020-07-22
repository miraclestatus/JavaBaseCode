package com.china.day08.luckymoney;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/22 17:42
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 200);
        Member one = new Member("成员A", 9);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        one.show();
        three.show();
        two.show();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = scanner.nextInt();
        System.out.println("请输入发几个红包");
        int count = scanner.nextInt();

        // 发红包方法
        ArrayList<Integer> redList = manager.send(money, count);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        manager.show();
        one.show();
        three.show();
        two.show();
    }
}
