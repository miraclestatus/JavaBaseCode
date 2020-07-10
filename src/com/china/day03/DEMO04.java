package com.china.day03;

/**
 * @author Eric Lee
 * @date 2020/7/8 16:32
 */
public class DEMO04 {
    public static void main(String[] args) {
        // 数组反转
        int[] arr = {1, 2, 3, 4, 5};
         // {5, 4,3,2, 1} min最小的索引， max最大的索引
        for (int min = 0, max = arr.length -1 ; min <= max ; min++, max--) {
                        int temp = arr[min];
                       arr[min]  = arr[max];
                       arr[max] = temp;
        }
        // 交换完之后遍历输出一下数组
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
}
