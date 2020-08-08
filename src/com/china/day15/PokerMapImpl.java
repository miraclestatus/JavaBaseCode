package com.china.day15;

import java.util.*;

/**
 * @author Eric Lee
 * @date 2020/8/8 15:57
 */
public class PokerMapImpl {
    public static void main(String[] args) {
        // 创建map集合进行存储
        Map<Integer, String> pokerMap = new HashMap<>();

        // 创建花色和数字集合
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        // 向 花色和数字集合添加值
        // 批量添加list集合的方式 使用Collections的addAll方法
        // 第一个参数是往谁那里去添加，第二个参数是添加的元素
        Collections.addAll(colors, "♥","♦","♠","♣");
        Collections.addAll(numbers, "2","3","4","5","6","7","8","9","10","J","Q","K","A");
        int count = 1;
        pokerMap.put(count++, "大王");  // 先赋值， 再自增
        pokerMap.put(count++, "小王");

        // 通过循环添加另外的52张牌
        for (String number :numbers){
            for (String color: colors){
                // 循环52次
                String card = color + number;
                pokerMap.put(count++, card);
            }
        }

        // 打印54张牌
        System.out.println(pokerMap);
        // 洗牌，将牌的顺序打乱
        // 将所有键取出来顺序进行打乱， 值就跟着对应打乱了
        // 取出所有键
        Set<Integer> numberSet = pokerMap.keySet();
        // 将牌的编号顺序打乱
        // 将numberSet转化成一个list类型
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        System.out.println("numberList"+ numberList);
        // 如果还使用之前的
        Collections.shuffle(numberList);
        System.out.println("打乱顺序之后的numberList"+ numberList);

        // 创建发牌的接收对象
        ArrayList<Integer> noP1 = new ArrayList<>();
        ArrayList<Integer> noP2 = new ArrayList<>();
        ArrayList<Integer> noP3 = new ArrayList<>();
        ArrayList<Integer> dipaiNo = new ArrayList<>();
        //  开始发牌的编号
        for (int i = 0; i < numberList.size() ; i++) {
            // 获取numberList中的值
            Integer no = numberList.get(i);

            if (i >= 51){
                dipaiNo.add(no);
            }else if (i % 3== 0){
                noP1.add(no);
            }else if (i % 3== 1){
                noP2.add(no);
            }else {
                noP3.add(no);
            }

        }
        // 将 四个对象手中的牌进行排序
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
        Collections.sort(dipaiNo);

        // 构造接收牌的4个对象
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        // 通过牌的编号取出牌中的值

        for (Integer num: noP1){
            String card = pokerMap.get(num);
            player1.add(card);
        }
        for (Integer num: noP2){
            String card = pokerMap.get(num);
            player2.add(card);
        }
        for (Integer num: noP3){
            String card = pokerMap.get(num);
            player3.add(card);
        }
        for (Integer num: dipaiNo){
            String card = pokerMap.get(num);
            dipai.add(card);
        }
        // 显示 玩家的牌

        System.out.println("马云发到的牌" + player1);
        System.out.println("马化腾发到的牌" + player2);
        System.out.println("王健林到的牌" + player3);
        System.out.println("底牌" + dipai);





    }
}
