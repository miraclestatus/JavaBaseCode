package com.china.day07;

/**
 * @author Eric Lee
 * @date 2020/7/20 19:54
 */
public class Demo2 {
    public static void main(String[] args) {
        // 类变量:当static修饰变量时，就是列表
        // 该类的每一个对象都共享同一个类变量的值
        // 任何对象都可更改变量的值
        // 也可以在不创建该类的对象的情况下对类变量进行操作
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 22);
//        Student s3 = new Student("王五", 22);
//        Student s4 = new Student("赵六", 22);
//
//        s1.show();
//        s2.show();
//        s3.show();
//        s4.show();
        // 修饰成员方法， 静态方法
        // 建议使用类名调用， 不需要创建对象
        System.out.println(Student.numberOfStudent);
        Student.showNum();
        // 静态方法可以直接访问类变量和静态方法
        // 静态方法不能调用普通的成员变量和成员方法
        // 成员方法可以直接访问类变量或静态方法
        // 静态方法 不能使用this关键字
        // 静态方法只能访问静态成员

    }
}
