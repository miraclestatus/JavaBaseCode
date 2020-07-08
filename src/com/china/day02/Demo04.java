package com.china.day02;

/**
 * @author Eric Lee
 * @date 2020/7/6 17:20
 */
public class Demo04 {
    public static void main(String[] args) {
        // break  跳出本层循环
        // continue  跳出本次循环， 执行下一次循环
//        for (int i = 1; i <= 10; i++) {
//            if ( i == 3){
//                // 结束循环
//                break;
//            }
//            System.out.println("今天是"+i);
//        }

        for (int i = 1; i <= 10; i++) {
            if (i == 3){
                continue;
            }

            System.out.println("今天是"+i);
        }












    }
}
