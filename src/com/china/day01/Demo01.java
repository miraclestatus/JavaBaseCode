package com.china.day01;
public class Demo01 {
    public static void main(String[] args){
        // 1、创建变量
        // 变量类型 变量名 = 变量值;
//        int i = 99;
////        System.out.println(i);
//        double i2 = 5.5;
//        System.out.println(i2); // 小数
//        // 数据类型转换
//        // 小 == 》 大 自动转换
//        double a = 3.444;
//        double b = a + 1;
//        // 大 转换成小  叫强制转换
//        // 变量类型 变量名 = (强制转换的数据类型)变量值;
//        int c = (int)5.5;
//        System.out.println(c);  // 直接舍弃掉，强制转换会损失精度
        // byte、short、char --> int --> long --> float --> double

        // java中 自增
//        int i = 5;
//        int a = 0;
//        a = i++; // 变量进行自增运算
//        System.out.println(a);
//        System.out.println(i);
        // i++先赋值 ，然后+1;
        int i = 5;
        int a = 0;
        a = ++i; // 变量进行自增运算
        System.out.println(a);
        System.out.println(i);
        // ++i;先自增， 后赋值

    }
}
