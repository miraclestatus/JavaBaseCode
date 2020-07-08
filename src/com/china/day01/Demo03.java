package com.china.day01;

import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/3 17:00
 */
public class Demo03 {
    public static void main(String[] args) {
//        if(判断条件1){
//            语句体1;
//        }else if (判断条件2){
//            语句体2;
//        }else if (判断条件3){
//            语句体3;
//        }
//        else {
//            语句体4;
//        }
//        输入考试成绩， 判断学生等级
        System.out.println("老铁，请输入你的成绩");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        //        int score = 43;
        if (score < 0 || score > 100 ){
            System.out.println("你的成绩是非法的");
        }else if (score <= 100 && score >= 90){
            System.out.println("优秀");
        }else if (score <= 89 && score >= 80){
            System.out.println("好");
        }else if (score <= 79 && score >= 70){
            System.out.println("良");
        }else if (score <= 69 && score >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}

