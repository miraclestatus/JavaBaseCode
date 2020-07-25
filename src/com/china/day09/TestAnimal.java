package com.china.day09;

/**
 * @author Eric Lee
 * @date 2020/7/25 20:06
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        // 调用实现接口的方法
        animal.eat();
        animal.sleep();
        // 调用接口的默认方法
        animal.method();
        // 调用静态方法
        LiveaAble.method2();

    }
}
