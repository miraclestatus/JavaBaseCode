package com.china.day03;

/**
 * @author Eric Lee
 * @date 2020/7/8 15:58
 */
public class DEMO02 {
    public static void main(String[] args) {
        // 数组是存储一系列数字的容器
        // 数组的定义
        // 第一种创建方式
        // 数组存储数字的类型[] 数组名 = new 数组存储数字类型[长度]
        // 创建了一个可以存6个元素的数组
        int[] array = new int[6];
        // .length是数组的一个属性
        System.out.println(array.length);
        System.out.println(array[0]);
        // 第二种创建方式
        //数组类型[] 数组名 = new 数组类型[]{元素1，元素2，元素3，}
        int[] arr = new int[]{1, 2, 3, 4,  5};
        System.out.println(arr[4]);

        // 第三种创建方式
        //数组类型[] 数组名 = {元素1，元素2，元素3，}
        int[] arr2 = {1, 2, 3, 4, 6};
        System.out.println(arr2[2]);
        // 数组的访问 数组名[index]


    }
}
