package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 16:20
 */
public class Teacher extends Employee {
    String Level;
    int num = 6;
    Teacher(){
        System.out.println("Teacher constructor");
    }

    public void printName(){
        System.out.println("name= "+ name);
    }
    public void show(){
        System.out.println("ZI num" + this.num);
        System.out.println("FU num" + super.num);
    }
    @Override
    public void work(){
        System.out.println("高效率的努力工作");
    }


}
