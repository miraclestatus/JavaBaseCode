package com.china.day09;

/**
 * @author Eric Lee
 * @date 2020/7/25 19:43
 */
public interface LiveaAble {
    // 含有抽象方法 使用abstract修饰的方法， 没有方法体，可以省略abstract
    // 该方法供子类去实现（接口中抽象方法的重写我们叫实现）
    public abstract void eat();
    public abstract void sleep();

    // 默认方法， 使用default关键字修饰不可省略， 供子类调用或者子类重写
    public default void method(){
        System.out.println("默认方法");
        method3();
    }

    // 静态方法， 供接口直接调用， 接口名.静态方法名（）
    public static void method2(){
        System.out.println("静态方法");
    }

    // 私有方法 9以上版本(了解)，供接口中的默认方法调用和静态方法调用
    private void method3(){
        System.out.println("私有方法被调用");
    }

}
