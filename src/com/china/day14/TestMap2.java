package com.china.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Eric Lee
 * @date 2020/8/5 17:01
 */
public class TestMap2 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // 增加数据
        map.put("吕布", "貂蝉");
        map.put("孙策", "大乔");
        map.put("周瑜", "小乔");
        map.put("刘备", "孙尚香");
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 增强for循环遍历然后，取出每一对键值
        for(Map.Entry<String, String> entry:entrySet){
            String  key = entry.getKey();// 获取当前的key
            String value = entry.getValue(); // 获取当前的value
            System.out.println(key+"====>"+value);
        }
    }
}
