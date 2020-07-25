package com.china.day09.interfaceMul;

/**
 * @author Eric Lee
 * @date 2020/7/25 20:28
 */
public class C implements A, B {
    @Override
    public void showA() {
        System.out.println("showA");
    }

    @Override
    public void showB() {
        System.out.println("showB");
    }

    @Override
    public void show() {
        System.out.println("show");

    }

    @Override
    public void method() {
        System.out.println("mc");
    }
}
