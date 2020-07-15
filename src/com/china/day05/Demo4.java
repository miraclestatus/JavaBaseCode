package com.china.day05;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/7/15 16:28
 */
public class Demo4 {
    public static void main(String[] args) {
        //<> 代表泛型、 对于输入的数据进行类型限制
//        ArrayList<Object> list = new ArrayList<>();
        Student[] students  = new Student[3]; // 引用数据类型
//        int[] ints = new int[3];
        Student s1 = new Student("gary", 17);
        Student s2 = new Student("tina", 18);
        Student s3 = new Student("jarvis", 20);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        // 遍历输出
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            System.out.println(student.getName()+"---"+student.getAge());

        }



    }
}
