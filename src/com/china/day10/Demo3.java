package com.china.day10;

/**
 * @author Eric Lee
 * @date 2020/7/29 16:47
 */
public class Demo3 {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.color);
        Car.Engine engine = new Car().new Engine();
        System.out.println(engine.type);
        engine.show();
    }
}
