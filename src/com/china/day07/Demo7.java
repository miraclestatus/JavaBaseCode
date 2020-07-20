package com.china.day07;

/**
 * @author Eric Lee
 * @date 2020/7/20 21:11
 */
public class Demo7 {
    public static void main(String[] args) {
        // 计算 -10.8 ~ 5.9之间吗绝对值大于6或者小于2.1的整数有多少个
        // 定义最小值
        double min = -10.8;
        // 定义最大值
        double max = 5.9;

        int count = 0;
        for (double i = Math.ceil(min) ; i <= Math.floor(max); i++ ){
            // 判断
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.println("个数为"+count);
    }
}
