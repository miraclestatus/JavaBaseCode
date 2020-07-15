package com.china.day05;

import java.util.Random;

/**
 * @author Eric Lee
 * @date 2020/7/15 17:17
 */
public class DEMO8 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            String s = vertifyCode();
            System.out.println("随机验证码" +s  );
        }
    }
    public static  String vertifyCode(){
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        System.out.println(arr[10]);
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6  ; i++) {
            int rIndex = random.nextInt(arr.length);
            code += arr[rIndex];
        }
        return code;
    }
}
