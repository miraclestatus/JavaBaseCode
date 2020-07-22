package com.china.day07;

/**
 * @author Eric Lee
 * @date 2020/7/20 20:25
 */
public class Demo3 {
// //        // 执行语句
////        // 作用， 给类变量进行初始化赋值
////    }   static {

    public static void main(String[] args) {
        // 静态代码代码块
        // 定义在成员位置，使用static修饰的代码块{}
        // 执行： 随着类的加载而执行且执行一次， 优先于main方法和构造方法执行
        System.out.println(Game.number);
        System.out.println(Game.list);
    }
}
