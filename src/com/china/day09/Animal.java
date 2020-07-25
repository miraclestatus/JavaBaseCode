package com.china.day09;

/**
 * @author Eric Lee
 * @date 2020/7/25 20:03
 */
public class Animal implements LiveaAble {
    @Override
    public void eat() {
        System.out.println("动物在吃");
    }

    @Override
    public void sleep() {
        System.out.println("动物在睡");

    }
}
