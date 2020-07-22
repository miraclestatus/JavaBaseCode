package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 16:03
 */
public abstract class Animal {
    public abstract  void run();
    // 抽象类的使用: 继承抽象类的子类必须重写父类所有的抽象方法
    // 否则，该子类必须声明为抽象类， 最终， 必须有子类实现该父类的抽象方法
    // 否则，从最初的父类到最终的子类都不能创建对象， 失去了意义

}
