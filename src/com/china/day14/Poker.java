package com.china.day14;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/8/5 15:40
 * 模拟斗地主洗牌发牌案例
 */
public class Poker {
    public static void main(String[] args) {
        // 准备牌， 每张牌有花色和数字组成
        // 使用多态的形式创建扑克盒
        // 创建牌盒， 存储牌
        Collection<String> pokerBox = new ArrayList<>();
        // 创建花色集合
        Collection<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        // 创建数字集合
        Collection<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10 ; i++) {
            numbers.add(""+i);
        }
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        numbers.add("A");
        // 将创建的牌添加到牌盒中
        for (String color :colors){
            for (String num: numbers){
                String card = color + num;
                pokerBox.add(card);
            }
        }
        // 添加大小王
        pokerBox.add("大王");
        pokerBox.add("小王");

        System.out.println(pokerBox);
        System.out.println(pokerBox.size());



        // 洗牌


        // 发牌


        // 将发放的所有牌进行展示
    }
}
