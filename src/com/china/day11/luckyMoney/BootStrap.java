package com.china.day11.luckyMoney;

import java.util.Map;

/**
 * @author Eric Lee
 * @date 2020/8/1 19:44
 */
public class BootStrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("微信红包模拟程序");
        // 设置群主名
        myRed.setOwnerName("哈利波特");

        // 分别调用普通红包策略和 手气红包策略
        // 普通红包
        NormalMode normalMode = new NormalMode();
        myRed.setOpenWay(normalMode);
        // 手气红包
    }
}
