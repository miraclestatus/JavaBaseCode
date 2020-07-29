package com.china.day10;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/29 15:46
 *  final /权限 /内部类
 *  类： 被修饰的类不能被继承， public final class String
 *  final 不可该变的， 用于修饰类，方法， 变量
 *  方法： 被修饰的方法，不能被重写
 *  变量， 被修饰的变量，不能被重新赋值
 *  使用 final class 类名 public final class String, Scanner、 Math
 *  修饰符 final 返回值类 方法名（参数列表）{
 *      // 方法体
 *  }
 *  修饰变量：
 *  1、局部变量的基本类型
 *  基本类型的局部变量被final修饰后， 只能赋值一次， 不能更改
 *  2、局部变量-引用类型
 *  局部变量-引用类型被final修饰后只能指向一个对象，但是不影响对象内部成员变量的创建
 *  3、成员变量
 *  成员变量涉及初始化问题，显示初始化和构造方法初始化只能二选一
 *    （1）显示初始化  （2）构造方法初始化
 *
 *
 */
public class Demo1 {
    public static void main(String[] args) {
//        final  int a;
//        a = 10;
////        a = 20;
//        int b = 100;
//        b = 200;
//        System.out.println(b);
//        不能 ，被final修饰 只能赋值一次，这里赋值了十次
//        final int c = 0;
//        for (int i = 0; i < 10 ; i++) {
//            c = i;
//            System.out.println(c);
//        }
        // 因为变量c写在了for循环里面，每次循环相当于重新创建了一个新的变量c
        for (int i = 0; i < 10 ; i++) {
            final int c = i ;
            System.out.println(c);
        }


    }
}
