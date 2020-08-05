package com.china.day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
        List<String> pokerBox = new ArrayList<>();
        // 创建花色集合
        List<String> colors = new ArrayList<>();
        colors.add("♥");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        // 创建数字集合
        List<String> numbers = new ArrayList<>();
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
        // 可以调用 collections工具类下面有一个shuffe方法
        Collections.shuffle(pokerBox);
        System.out.println("洗完牌"+ pokerBox);
        // 发牌
        // 创建玩家一、玩家二、 玩家三、底牌四个集合，
        // 将pokebox里面的牌分别发给这四个对象
        List<String> player1 = new ArrayList<>();
        List<String> player2 = new ArrayList<>();
        List<String> player3 = new ArrayList<>();
        List<String> dipai = new ArrayList<>();
        // 遍历扑克盒对象然后发牌
        for (int i = 0; i < pokerBox.size() ; i++) {
           String card =  pokerBox.get(i);
           // 根据i的值进行判断发牌
            if (i >=51){
                // 留给底牌
                dipai.add(card);
            } else if (i%3==0){
                player1.add(card);
            }else if (i%3==1){
                player2.add(card);
            }else {
                player3.add(card);
            }
        }
        // 将发放的所有牌进行展示
        System.out.println("玩家1"+player1);
        System.out.println("玩家2"+player2);
        System.out.println("玩家3"+player3);
        System.out.println("底牌是" + dipai);
    }
}
