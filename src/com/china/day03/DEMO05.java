package com.china.day03;

/**
 * @author Eric Lee
 * @date 2020/7/8 16:51
 */
public class DEMO05 {
    public static void main(String[] args) {
        // 数组作为方法的参数
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 8888};
        printArray(arr1);
    }
    // 编写一个方法，他可以打印出任意一个数组的所有元素
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}
