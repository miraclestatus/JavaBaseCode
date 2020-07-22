package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 16:21
 */
public class TestTeacher {
    public static void main(String[] args) {
        /**
         *   继承后成员变量、成员方法、构造函数的特点
         *   继承后成员变量的特点
         *   成员变量不重名 ---> 没有影响
         *   成员变量重名 ---> 有影响
         *   子父类中出现了重名的成员变量， 在子类中需要访问父类的非私有成员变量时
         *   使用super关键字， super.变量名
         *   成员方法不重名 ---> 没有影响
         *   成员方法重名  ----> 方法的重写 ：子类中出现了与父类一模一样的方法（返回值类型、方法名、参数列表都相同）
         *   Override
         *   重写： 声明不变、重新实现
         *   继承后构造方法的特点
         *   回忆：构造方法与类名保持一致， 所以子类无法继承父类的构造方法
         *   构造方法的作用是初始化成员变量的，所以子类的初始化过程必须调用父类的初始化动作
         *   子类的构造方法中默认有一个super()， 表示调用父类的构造方法， 父类成员变量初始化后， 才可以给子类使用
         *   super： 代表父类的存储空间标识（父类的引用）
         *   this： 代表当前对象的引用
         *   用法：
         *   访问成员
         *   this.成员变量     本类的
         *   super.成员变量     父类的
         *   方法
         *   this.成员方法()  本类的
         *   super.成员方法()  父类的
         */
        Teacher teacher = new Teacher();
        teacher.name = "小德子";
        teacher.Level = "15";
        System.out.println(teacher.name);
        System.out.println(teacher.Level);
        System.out.println(teacher.num);
        teacher.show();
        teacher.printName();
        teacher.work();
    }
}
