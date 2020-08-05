package com.china.day14;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eric Lee
 * @date 2020/8/5 17:18
 */
public class TestStudent {
    public static void main(String[] args) {
        // 创建map集合
        Map<Student, String> map = new HashMap<>();
        // 添加元素
        map.put(new Student("张三", 16), "北京");
        map.put(new Student("李四", 12), "上海");
        map.put(new Student("王五", 32), "广州");
        map.put(new Student("张三", 16), "南京");
        map.put(new Student("田七", 43), "武汉");

        for (Map.Entry<Student, String> entry:map.entrySet()) {
            System.out.println( entry.getKey() +"=====>"+ entry.getValue());
        }
        // 解决自定义类型作为key保证key的唯一性方式是，重写对象的equals和hashcode方法
    }
}
