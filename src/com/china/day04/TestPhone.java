package com.china.day04;

/**
 * @author Eric Lee
 * @date 2020/7/10 16:15
 */
public class TestPhone {
    public static void main(String[] args) {
        // 创建手机对象
        Phone p = new Phone();
        // 输出成员的默认值
        System.out.println(p.brand);
        // 赋值
        p.brand = "HUAWEI";
        System.out.println(p.brand);
        p.call("马云");
    }
}
