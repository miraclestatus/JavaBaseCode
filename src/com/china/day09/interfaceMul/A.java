package com.china.day09.interfaceMul;

public interface A {
    public abstract void showA();
    public abstract void show();

    public default void methodA(){
        System.out.println(" A methodA");
    }
    public default void method(){
        System.out.println(" A method");
    }

}
