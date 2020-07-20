package com.china.day07;

/**
 * @author Eric Lee
 * @date 2020/7/20 21:01
 */
public class Demo6 {
    public static void main(String[] args) {
//        Math 类包含基本的数学方法， 如初等指数、对数、平方根和三角函数
        //  绝对值
        int abs = Math.abs(-5);
        double abs1 = Math.abs(3.3);
        System.out.println(abs);
        System.out.println(abs1);
        // ceil 返回大于等于参数的 最小整数
        double ceil = Math.ceil(3.3);
        System.out.println(ceil);
        double ceil1 = Math.ceil(-3.3);
        System.out.println(ceil1);
        double ceil2 = Math.ceil(5.1);
        System.out.println(ceil2);
        // floor 返回小于等于参数的 最小整数
        double floor = Math.floor(3.3);
        System.out.println(floor);
        double floor1 = Math.floor(-3.3);
        System.out.println(floor1);
        // round 四舍五入
        long round = Math.round(5.5);
        System.out.println(round);
        long round1 = Math.round(5.4);
        System.out.println(round1);
    }
}
