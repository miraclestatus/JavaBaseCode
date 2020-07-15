package com.china.day05;

import java.util.ArrayList;

/**
 * @author Eric Lee
 * @date 2020/7/15 16:46
 */
public class Demo5 {
    public static void main(String[] args) {
        // ArrayList的基本操作
        // 创建了学生数组存储的ArrayList类
        ArrayList<Object> list = new ArrayList<>();

        String s1 = "tina";
        String s2 = "jarvis";
        String s3 = "gary";
        String s4 = "无名火";
        // 打印添加前数组的情况
        System.out.println(list);
        // 向arraylist中添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list);
        // 访问
//        System.out.println(list.get(2));
        // 集合中元素个数 .size
        System.out.println(list.size());

        // 遍历
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        // 删除，
        System.out.println(list.remove(3));
        System.out.println(list);

    }
}
