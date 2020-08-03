package com.china.day12.others;

import javax.swing.*;

/**
 * @author Eric Lee
 * @date 2020/8/3 19:50
 */
public class Demo2 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.equals(person2)); // false
        // 因为此时是引用类型， person1和person2是两个对象
        // 如果没有覆盖equals方法，那么Object类中的equals是 "=="比较，
        // 比较两个对象的地址值， 也就是说不是一个对象就会返回false;
        // String类重写了Object类中的equals方法， 比较的是两个字符串的字面量值是否相等
        String s1 = new String("abs");
        String s2 = new String("abs");
        System.out.println(s1.equals(s2)); // true, String类重写了Object类中的equals方法
    }
}
