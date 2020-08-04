package com.china.day13;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/8/4 21:24
 */
public class Demo10 {
    public static void main(String[] args) {
        // 增强for循环
        // 格式
//        for (返回类型  每次取出的值: 迭代对象){}
//
//    }
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        // 普通for循环
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int a : arr){
//            System.out.println(a);
//        }

        Collection<String> list = new ArrayList<>();
        list.add("小鲁班");
        list.add("后羿");
        list.add("安琪拉");
        // 增强for循环遍历
        for (String hero : list){
            System.out.println(hero);
        }

    }




}
