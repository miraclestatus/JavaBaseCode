package com.china.day05;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/7/15 17:08
 */
public class Demo7 {
    public static void main(String[] args) {
        Student s1 = new Student("gary", 17);
        Student s2 = new Student("tina", 18);
        Student s3 = new Student("jarvis", 20);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
           String name = list.get(i).getName();
           int age = list.get(i).getAge();
            System.out.println(name+"----"+age);

        }

    }
}
