package com.china.day02;

/**
 * @author Eric Lee
 * @date 2020/7/6 17:56
 */
public class Demo08 {
    public static void main(String[] args) {
        // 调用方法
        caculateNum();
    }

//    修饰符 返回值类型 方法名(参数列表){
//        方法体;
//        return 结果;
//    }
    public static void caculateNum(){
//        System.out.println("haha");
        int sum = 0;
        int i = 1;
        while (i <= 100){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
