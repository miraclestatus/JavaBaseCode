package com.china.day07;

/**
 * @author Eric Lee
 * @date 2020/7/20 19:51
 */
public class Student {
//    public void sayStudentHello(){
//        System.out.println("hahahaha");
//    }
    private String name;
    private int age;
    // 学生id 学号
    private int sid;

    public static int numberOfStudent = 0;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++numberOfStudent;
    }
    public void show(){
        System.out.println("Student: name= "+name +", age = "+age+ ", sid = "+sid);
    }
    public static void showNum(){
        System.out.println("num:"+ numberOfStudent);
    }
}
