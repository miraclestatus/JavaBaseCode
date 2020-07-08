package com.china.day02;

/**
 * @author Eric Lee
 * @date 2020/7/6 16:13
 * 循环语句
 */
public class Demo01 {

    public static void main(String[] args) {
        // for 循环格式
//        for(初始表达式;布尔表达式;步进表达式){
//            循环体
//        }

//        for(int x = 1; x < 10 ; x++){
//            System.out.println("我真的好帅" + x);
//        }
//         计算 1-100之间所有的偶数 累加和
        int sum = 0;
        for (int i = 0; i <=100 ; i++){
            if(i % 2 == 0){
                // 进行累加
//                sum = sum + i;
                sum += i;

            }
        }
        System.out.println("累加和" + sum);



    }


}
