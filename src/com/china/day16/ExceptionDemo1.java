package com.china.day16;

/**
 * @author Eric Lee
 * @date 2020/8/12 17:03
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int element = getElement(arr, 5);
        System.out.println(element);
    }
    public  static int getElement(int[] arr, int index){
        if (index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("兄弟数组索引不合法呀");
        }
        return arr[index];
    }
}
