package com.china.day03;

/**
 * @author Eric Lee
 * @date 2020/7/8 17:01
 */
public class DEMO06 {
    // 数组作为方法发返回值类型
    public static void main(String[] args) {
       int[] arr = getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] getArray(){
        int[] arr1 = {1, 2, 3, 4, 5};
        return arr1;
    }
}
