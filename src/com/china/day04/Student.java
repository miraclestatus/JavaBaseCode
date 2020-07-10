package com.china.day04;

/**
 * @author Eric Lee
 * @date 2020/7/10 15:54
 */
public class Student {
    //    成员变量
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //   成员方法
    public void study() {
        System.out.println("good good study， day day up");
    }

    public void eat() {
        System.out.println("学习饿了要吃饭");
    }

}
