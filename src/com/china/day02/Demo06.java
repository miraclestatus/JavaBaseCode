package com.china.day02;

/**
 * @author Eric Lee
 * @date 2020/7/6 17:32
 */
public class Demo06 {
    public static void main(String[] args) {
//        int sum = 0;
//        int i = 1;
//        // 当sum 的值 大于1000 跳出循环
//        while (i <= 100){
//            sum += i;
//            // 代码
//            if(sum > 1000){
//                break;
//            }
//            i++;
//        }
//        System.out.println(sum);

        // 使用continue计算奇数累加和
        int sum = 0;
        int i = 1;
        // 当sum 的值 大于1000 跳出循环
        while (i <= 100){
            if ( i % 2==0){
                i ++;
                continue;
            }
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
