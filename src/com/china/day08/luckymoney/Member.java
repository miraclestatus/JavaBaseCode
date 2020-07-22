package com.china.day08.luckymoney;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/7/22 17:39
 */
public class Member extends User {
    public Member() {
    }

    public Member(String userName, int leftMoney) {
        super(userName, leftMoney);
    }
    // 打开红包
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        Integer remove = list.remove(index);
        int leftMoney = super.getLeftMoney();
        super.setLeftMoney(leftMoney + remove);
    }



}
