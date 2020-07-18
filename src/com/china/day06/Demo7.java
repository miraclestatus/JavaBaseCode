package com.china.day06;

/**
 * @author Eric Lee
 * @date 2020/7/18 11:52
 */
public class Demo7 {
    public static void main(String[] args) {
        // {1, 2, 3} ==> [word1#word2#word3]
        int[] arr = {1, 2, 3, 4};
        // 调用方法
        String s = arrayToString(arr);
        System.out.println(s);
    }
    public static String arrayToString(int[] arr){
        String s = new String("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
               s =  s.concat(arr[i] + "]");
            }else {
                s = s.concat(arr[i] + "#");
            }

        }
        return s;
    }
}
