package com.china.day05;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/7/15 16:06
 */
public class Demo3 {
    public static void main(String[] args) {
        // 猜数字 ,  生成1 ~ 100数字， 然后开始猜
        // 生成随机数
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int count = 0;
        while (true){
            count++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您要猜的数字（1~100）");
            int guessNumber = scanner.nextInt();
            // 比较
            if(guessNumber > number){
                System.out.println("你猜对数据"+ guessNumber + "大了");
            } else if (guessNumber < number){
                System.out.println("你猜对数据"+ guessNumber + "小了");
            }else {
                System.out.println("恭喜你"+ count +"次猜对了 ");
                break;
            }

        }

    }
}
