package com.china.day14;

import java.util.HashMap;
import java.util.Set;

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
        map.put("HanMeiMei", 70);
        map.put("LiLei", 75);
        System.out.println("添加后的"+ map);
        // get方法, 根据键去访问响应的值
        Integer jarvis = map.get("Jarvis");
        Integer gary = map.get("Gary");
        System.out.println(jarvis);
        System.out.println(gary);
        // 删除, 返回的是删除的键对应的值
        Integer res = map.remove("Eric");
        System.out.println(res);
        // 判断集合中是否包含整个键
        System.out.println(map.containsKey("Eric"));
        System.out.println(map.containsKey("Jarvis"));
        System.out.println(map.containsKey("Gary"));
        // 获取到所有的键
        Set<String> keySet = map.keySet();
        System.out.println(keySet);
        // 我们拥有了所有键的集合，就可以遍历这个集合，进而遍历map中所有的值
        for(String key :keySet){
            Integer score = map.get(key);
            System.out.println(key + "------>" + score);
        }
    }
}
