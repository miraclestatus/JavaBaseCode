package com.china.day04;

/**
 * @author Eric Lee
 * @date 2020/7/10 17:23
 */
public class Circle {
    private int r;
    public Circle() {

    }
    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public void showArea() {
        System.out.println(3.14*r*r);
    }
    public void showPerimeter() {
        System.out.println(3.14*2*r);
    }

}
