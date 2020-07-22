package com.china.day08;

/**
 * @author Eric Lee
 * @date 2020/7/22 16:21
 */
public class TestTeacher {
    public static void main(String[] args) {
//        继承后成员变量、成员方法、构造函数的特点
    //   继承后成员变量的特点
    // 成员变量不重名 --- 》 没有影响
    // 成员变量重名 --- 》 有影响
        // 子父类中出现了重名的成员变量， 在子类中需要访问父类的非私有成员变量时
        // 使用super关键字， super.变量名
        Teacher teacher = new Teacher();
        teacher.name = "小德子";
        teacher.Level = "15";
        System.out.println(teacher.name);
        System.out.println(teacher.Level);
        System.out.println(teacher.num);
        teacher.show();
    }
}
