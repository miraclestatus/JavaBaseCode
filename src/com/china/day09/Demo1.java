package com.china.day09;

/**
 * @author Eric Lee
 * @date 2020/7/25 19:36
 *
 * 接口和多态
 */
public class Demo1 {

    public static void main(String[] args) {
        // 1、接口： Java中一种引用数据类型
        /**
         *  public interface 接口名{
         *      // 抽象方法  JDK 1.7之前
         *      // 默认方法  JDK 1.8加入
         *      // 静态方法  JDK 1.8加入
         *      // 私有方法  JDK 1.9加入
         *  }
         *  2、 接口的多实现
         *  之前学习类, 一个类智能继承另外一个类，
         *  对于接口而言, 一个类可以实现多个接口， 这叫做接口的多实现
         *  并且， 一个类能继承一个父类，同时实现多个接口
         *  class 类名 [extends 父类名] implements 接口1，接口2，接口3，{
         *      // 重写接口中所有抽象方法【必须的】
         *      重写接口中默认的方法【可选】
         *    总结：1、接口中有多个抽象方法，实现类必须实现所有的抽象方法，
         *    如果抽象方法重名，只需要重写一次即可
         *    2、接口中、有多个默认方法时， 实现类都可继承使用，可以不重写
         *    如果默认方法重名，必须要重写一次
         *    3、静态方法：接口中存在同名的静态方法并不会冲突， 因为静态方法时通过接口名调用的
         *    接口名不同，也就不存在冲突问题
         *  }
         */

        /**
         * 多态： 同一种行为，具有不同的表现形式
         * 多态是Java面向对象的第三大特性（封装、 继承）
         * 前提:
         * 1、继承或实现（2选1）
         * 2、方法的重写，
         * 3、父类引用指向子类对象（格式的体现）
         * 格式：
         * 父类类型 变量名 = new 子类对象；
         * 变量名.方法名()
         * Fu z = new Zi()
         * 重要的一句话：当使用多态方式调用方法时, 首先检查父类中是否有该方法，
         * 没有的话，会编译错误，如果有， 执行的是子类重写后的方法
         *
         *
         *
         */


    }
}
