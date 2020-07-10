package com.china.day04;

/**
 * @author Eric Lee
 * @date 2020/7/10 15:33
 *  在Java面向对象中：
 *  类与对象
 *  类是对一类事物的描述， 是抽象的
 *  对象是一类事物的实例，是具体的
 *  类是对象的模板，对象是类实体
 *  类里包含：属性（事物的状态信息）、行为（事物能够做什么事）
 *  Java 成员变量，对应事物的属性， 成员方法对应事物的行为
 *  public class 类名{
 *      成员变量
 *      成员方法
 *  }
 *
 *
 *
 */
public class Demo01 {
    public static void main(String[] args) {
       // 类的使用
        // 类名 对象名 = new 类名();
        Student s = new Student(); // 创建了一个 s对象
        // 对象名.成员变量
        System.out.println(s.name); // 默认是null值
        System.out.println(s.age); // 默认是0
        s.name = "石敢当";
        s.age = 11;
        System.out.println(s.name); // 默认是null值
        System.out.println(s.age); // 默认是0
        s.name = "tfboy";
        s.age = 17;
        System.out.println(s.name); // 默认是null值
        System.out.println(s.age); // 默认是0
        // 对象名.成员方法();
        s.eat();
        s.study();

    }
}
