package com.china.day11.others;

/**
 * @author Eric Lee
 * @date 2020/8/1 21:19
 */
public class Demo1 {
    public static void main(String[] args) {
        // 如果一个类没有继承， 默认是继承Object类
        // Object类 的所有方法都可被任何Java创建的类使用
        // 主要介绍 toString方法和equals方法

//        Object o = new Object();
        Person p = new Person("马云", 22);
        System.out.println(p.toString());
        // 等价于
        System.out.println(p);
        // com.china.day11.others.Person@75412c2f
        // 没有重写toString()， 默认会调用Object的toString方法；
        // Object的toString打印的是对象的类全限定名 @ 地址值
    }
}
