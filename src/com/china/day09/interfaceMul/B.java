package com.china.day09.interfaceMul;

public interface B {
    public abstract void showB();
    public abstract void show();
    public default void methodB(){
        System.out.println(" A methodB");
    }
    public default void method(){
        System.out.println(" B method");
    }
}
