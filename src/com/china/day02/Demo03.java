package com.china.day02;

/**
 * @author Eric Lee
 * @date 2020/7/6 17:04
 */
public class Demo03 {
    public static void main(String[] args) {
        // do while 循环
        //初始化表达式
//        do {
//            循环体
//        } while (布尔表达式);

        int x = 1;
        do {
            System.out.println("haha"+x);
            x ++ ;
        }while (x <= 10);

//        do {
//            System.out.println("无条件执行一次");
//        }while (false);
        // 特点， 无条件执行一次循环体

        // 一致循环次数的使用for ， 未知推荐while

    }
}
