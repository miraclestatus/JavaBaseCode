package com.china.day01;

public class Demo02 {
    public static void main(String[] args) {
        // 流程控制，
        // 顺序结构从上到下
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        // 判断语句
//        if(关系表达式){
//            语句体1;
//        }else {
//            语句体2;
//        }
        int a = 100;
        int b = 30;
        if (a == b){
            System.out.println("a等于b");
        }else {
            System.out.println("a不等于b");
        }
        int c = 100;
        if (a == c){
            System.out.println("a等于c");
        }else {
            System.out.println("a不等于c");
        }
    }
}
