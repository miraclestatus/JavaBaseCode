package com.china.day09.dizhu;

import java.util.*;

/**
 * @author Eric Lee
 * @date 2020/7/29 11:07
 */
public class TestDouDIZhu {
    public static void main(String[] args) {

    }
//    public static LinkedList<Poker> getPokerList() {
//        LinkedList<Poker> pokers = new LinkedList<Poker>();
//        LinkedList<Poker> newPokers = new LinkedList<Poker>();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int[] arr;
//        /*生成54张扑克牌（Poker对象）*/
//        /*用嵌套循环生成从方块3到黑桃2的Poker对象，放进Poker的LinkedList保证顺序*/
//        String[] colors = {"♦", "♣", "♥", "♠"};
//        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < colors.length; j++) {
//                Poker p = new Poker(colors[j], numbers[i], (4 * i) + j + 1, false);
//                pokers.add(p);
//            }
//        }
//        /*添加大小王*/
//        pokers.add(new Poker("black", "☆", 53, false));
//        pokers.add(new Poker("red", "☆", 54, false));
//
//        /*将生成的54张扑克牌从1到54放进map*/
//        for (int z = 1; z <= pokers.size(); z++) {
//            map.put(z, pokers.get(z - 1));
//        }
//        /*遍历Map,将每个Poker对应的key放进 ArrayList<Integer> arrayList */
//        Set<Map.Entry<Integer, Poker>> set = map.entrySet();
//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            Map.Entry<Integer, Poker> e = (Map.Entry<Integer, Poker>) it.next();
//            arrayList.add(e.getKey());
//        }
//        /*利用Collections.shuffle随机排序key*/
//        Collections.shuffle(arrayList);
//        /*将乱序后的key对于的Poker放进newPokers里面 */
//        for (Integer i : arrayList) {
//            newPokers.add(map.get(i));
//        }
//
//        return newPokers;
//    }
}
