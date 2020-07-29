package com.china.day10;

/**
 * @author Eric Lee
 * @date 2020/7/29 16:10
 */
public class Demo2 {
    public static void main(String[] args) {
        final   User user = new User("d113333");
        System.out.println(user);
//        user = new User();
        System.out.println(user);

        user.age  = 18;
        System.out.println(user.age);

    }
}
