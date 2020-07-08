package com.china.day01;


import java.util.Scanner;

public class Demo04 {
    // 选择语句 switch
    public static void main(String[] args) {
//        switch (表达式){
//            case 常量值1：
//                语句体1；
//                break;
//            case 常量值2：
//                语句体2；
//                break;
//            case 常量值3：
//                语句体3；
//                break;
//            default:
//                语句体n+1；
//                break;
//        }
        // 判断星期几
        System.out.println("请输入暗号");
        Scanner scanner = new Scanner(System.in);
        int weekday = scanner.nextInt();
        // 表达式数据类型可以是byte， short， int char ，enum， 字符串
        switch (weekday){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的数字有误");
                break;
        }
    }

}
