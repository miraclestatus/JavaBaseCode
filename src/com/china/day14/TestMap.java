package com.china.day14;

import java.util.HashMap;

/**
 * @author Eric Lee
 * @date 2020/8/5 16:36
 */
public class TestMap {
    public static void main(String[] args) {
        // 创建一个Map集合对象
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("未添加前"+map);
        // 向map中添加元素
        map.put("Jarvis", 100);
        map.put("Gary", 100);
        map.put("Eric", 60);
        System.out.println("添加后的"+ map);
        // get方法, 根据键去访问响应的值
        Integer jarvis = map.get("Jarvis");
        Integer gary = map.get("Gary");
        System.out.println(jarvis);
        System.out.println(gary);

    }
}
