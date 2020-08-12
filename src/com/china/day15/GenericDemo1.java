package com.china.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Eric Lee
 * @date 2020/8/8 17:24
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        // 详解泛型
        // 为什么要使用泛型呢？ 好处是什么
        // 可以将运行时期的异常, 转移到了编译时期，变成了编译失败， 确保程序的健壮性
        // 避免了类型强转的麻烦
//        ArrayList list = new ArrayList();
//        Collection<Object> list = new ArrayList<>();
        // <Object>泛型里面是<Object>代表集合中存储的数据不做限制， 任何对象类型都可以
        Collection<String> list = new ArrayList<>();
        // 只能存储 String类型的数据
        list.add("abc");
        list.add("def");
//        list.add(12);
        list.add("12");

        // 明确了存储的类型， 我们就可以在使用譬如迭代器这样的方法，可以自动推断返回值类型
        Iterator<String> iterator = list.iterator();

        // 修饰符  class 类名<代表泛型的变量>{
        //}
    }
}
