package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 17:04
 */
public class Dog extends Animal2 {
    public void eat(){
        System.out.println("dog ：eat");
    }
    public void eatTest(){
        //调用本类的eat
        this.eat();
        // 调用父类的eat
        super.eat();
    }
}
