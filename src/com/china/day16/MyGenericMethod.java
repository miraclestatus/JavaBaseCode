package com.china.day16;

/**
 * @author Eric Lee
 * @date 2020/8/12 16:02
 */
public class MyGenericMethod {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }



}
