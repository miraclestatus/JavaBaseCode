package com.china.day09.duotai;

/**
 * @author Eric Lee
 * @date 2020/7/25 20:58
 */
public class Test {
    public static void main(String[] args) {

//        Cat c = new Cat();
        // 多态的形式
        // 父类引用指向子类对象
        Animal a = new Cat();
        a.eat();
        // 多态的形式
        Animal a2 = new Dog();
        a2.eat();
    }
}
