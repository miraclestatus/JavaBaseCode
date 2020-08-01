package com.china.day11.luckyMoney;

import com.china.day11.luckyMoney.utils.OpenMode;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/8/1 20:20
 */
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        // 编写 普通红包的分发策略
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney/count;
        int mod = totalMoney%count; // 红包的零头

        for (int i = 0; i < count -1 ; i++) {
            list.add(avg);
        }
        // 处理最后一个
        int last  = avg + mod;
        list.add(last);
        return list;
    }
}
