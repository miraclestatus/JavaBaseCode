package com.china.day03;

/**
 * @author Eric Lee
 * @date 2020/7/8 16:14
 */
public class DEMO03 {
    public static void main(String[] args) {
        // 数组的遍历 , 一个一个从元素中取出
//        int[] arr2 = {1, 2, 3, 4, 6};
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);
//        System.out.println(arr2[4]);

//        for (int i = 0; i < arr2.length ; i++) {
//            System.out.println(arr2[i]);
//        }
//        for (int i = 1; i <= arr2.length ; i++) {
//            System.out.println(arr2[i-1]);
//        }
//        求数组中最大的元素
        int[] arr = {1, 333, 444, 777, 9999};
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
//            int val = arr[i];
            if (arr[i] > max){
                max =arr[i];
}
        }
        System.out.println("数组中最大的值是"+ max);

    }
}
