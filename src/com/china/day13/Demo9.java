package com.china.day13;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/8/4 21:04
 */
public class Demo9 {
    public static void main(String[] args) {
        // 使用多态的方式创建一个集合list， 这个list属于Collection类
        Collection<String> list = new ArrayList<>();
//        public boolean add(E e) , 把给定的对象元素e添加到集合中
        list.add("小鲁班");
        list.add("后羿");
        list.add("安琪拉");
        System.out.println(list);
//        public boolean contains(E e)；判断集合中是否包含给定的元素
        boolean bool = list.contains("小鲁班");
        boolean bool2 = list.contains("鲁班");
        System.out.println(bool);
        System.out.println(bool2);
//        public boolean isEmpty()； 判断当前集合是否为空
        boolean empty = list.isEmpty();
        System.out.println(empty);
//        public int size()；返回集合中元素的个数
        int size = list.size();
        System.out.println(size);
//        public Object[ ] toArray()； 把集合中的元素返回为 Object[ ]数组
        Object[] objects = list.toArray();
        for (int i = 0; i < objects.length ; i++) {
            System.out.println( objects[i]);
    }
//        public boolean remove(E e)； 把给定的对象元素e从集合中删除
        boolean b = list.remove("后羿");
        System.out.println(list);
//        public void clear() , 清空集合中所有的元素
        list.clear();
        System.out.println(list);
    }
}
