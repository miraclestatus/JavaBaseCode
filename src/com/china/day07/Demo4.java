package com.china.day07;

import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/7/20 20:40
 */
public class Demo4 {
    public static void main(String[] args) {
        //Arrays类
        int[] arr = {111, 2343, 344, 4324, 322};
        System.out.println(arr);// [I@1b6d3586
        // 将数组内容转化成字符串
//        String s =Arrays.toString(arr);
        System.out.println("排序前" +  Arrays.toString(arr));
        // 升序排序
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));


    }
}
