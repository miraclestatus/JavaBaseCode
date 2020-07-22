package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 16:19
 */
public class Employee extends Object {
    String name;
    int num =5;
    Employee(){
        super(); // 调用父类构造方法
        System.out.println("Employee Constructor");
    }
    public void work(){
        System.out.println("努力的工作吧");
    }
}
