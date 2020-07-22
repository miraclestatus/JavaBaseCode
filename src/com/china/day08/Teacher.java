package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 16:20
 */
public class Teacher extends Employee {
    String Level;
    int num = 6;
    public void printName(){
        System.out.println("name= "+ name);
    }
    public void show(){
        System.out.println("ZI num" + this.num);
        System.out.println("FU num" + super.num);
    }


}
