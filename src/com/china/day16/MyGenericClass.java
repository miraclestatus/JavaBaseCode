package com.china.day16;

/**
 * @author Eric Lee
 * @date 2020/8/12 15:46
 */
public class MyGenericClass<MVP> {
    // 没有 mvp这个类型。 在这里他代表是一种未知的数据类型
    private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
}
