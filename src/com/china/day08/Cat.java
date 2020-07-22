package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 16:08
 */
public class Cat extends Animal {
    // 我们将这种重写叫做实现父类的抽象方法
    @Override
    public void run() {
        System.out.println("小猫顺着墙根跑。。。");
    }
}
