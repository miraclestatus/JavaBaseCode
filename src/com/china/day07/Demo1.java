package com.china.day07;

/**
 * @author Eric Lee
 * @date 2020/7/20 19:48
 * static关键字
 */
public class Demo1 {
    public static void main(String[] args) {
        // 静态的 static
        // 可以用来修饰成员变量和成员方法，
        // 被修饰的成员属于类， 而不单单属于某个对象
        // 也就是说既然不属于类，就可以不靠对象来调用
        sayHello();
        Student student = new Student();
        student.sayStudentHello();
    }
    public static void  sayHello(){
        System.out.println("haha");
    }
}


