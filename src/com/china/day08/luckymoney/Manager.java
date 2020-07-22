package com.china.day08.luckymoney;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/7/22 17:49
 */
public class Manager extends User{
    public Manager() {
    }

    public Manager(String userName, double leftMoney) {
        super(userName, leftMoney);
    }

    // 发红包
    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        // 看一下群主多少前
        double leftMoney = super.getLeftMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
        }
        // 扣钱
        super.setLeftMoney(leftMoney -totalMoney);
        int avg = totalMoney/ count;
        int mod = totalMoney %count;
        for (int i = 0; i < count-1 ; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;



    }
}
