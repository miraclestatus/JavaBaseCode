package com.china.day11.luckyMoney;

import com.china.day11.luckyMoney.utils.OpenMode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/8/1 20:21
 */
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        // 实现手气红包的分割
        // 随机分配 分配金额是 totalMoney 单位分
        // 随机分配的公式是什么
        // 随机分红包要有上限和下限
        // 下限: 最少发 1分钱  1 +
        // 上限： 最多不超过当前平均值的 2倍
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int leftMoney = totalMoney; // 剩余没发的金额
        int leftCount = count; // 还有几个红包没赋值
        // 发红包
        for (int i = 0; i < count - 1 ; i++) {
            int avg2 = leftMoney/leftCount*2;
            // 随机金额
            int money = random.nextInt(avg2) + 1;
            list.add(money);
            // 每次更新leftMoney和leftCount
            leftCount--;
            leftMoney = leftMoney - money;
        }
        // 最后一个包是不需要随机，因为我们要全发出去
        list.add(leftMoney);


        return list;


    }
}
