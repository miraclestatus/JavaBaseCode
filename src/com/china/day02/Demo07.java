package com.china.day02;

/**
 * @author Eric Lee
 * @date 2020/7/6 17:48
 */
public class Demo07 {
    public static void main(String[] args) {
        // 外层循环负责行数， 里层是每一行大内容
        // 5 x 8 的矩形星星
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 8 ; j++) {
                System.out.print("*\t");
            }
            // 换行
            System.out.println("");
        }
    }
}
