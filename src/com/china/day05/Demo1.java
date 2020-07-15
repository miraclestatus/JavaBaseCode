package com.china.day05;


import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/15 15:36
 * API:在java中api是一本程序员的字典
 * 初阶常用的api
 * Scanner、Random、ArrayList类
 */
public class Demo1 {
    public static void main(String[] args) {
        // 文本扫描器， System.in代表系统输入指定的是键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        //
        String s = sc.nextLine();
        System.out.println(s);
        int i  = sc.nextInt();
        System.out.println(i);

        // 上面new的对象都是属于引用类型
        // 引用类型的使用步骤
        // 1、导包 java.lang 下的包无需导入
        // import java.util.Scanner;
        // import 包名.类名
        // 2、创建对象
        //  数据类型 变量名 = new 数据类型（参数列表）
        // 3、调用方法
        // 变量名.方法名()


    }
}
