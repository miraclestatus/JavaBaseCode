package com.china.day16;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Eric Lee
 * @date 2020/8/12 16:30
 */
public class MyGenericGaoJi {
//    现在已知Object类、String类、Number类、Integer类，其中Number类是Integer类的父类..
    // 使用泛型的上限和下限
public static void main(String[] args) {
    Collection<Integer> list1 = new ArrayList();
    Collection<String> list2 = new ArrayList();
    Collection<Number> list3 = new ArrayList();
    Collection<Object> list4 = new ArrayList();

    getElement1(list1);  // ok
//    getElement1(list2);  // error
    getElement1(list3); // ok
//    getElement1(list4);error

//    getElement2(list1);error
//    getElement2(list2);
    getElement2(list3);// ok
    getElement2(list4);// ok


}
   // 定义Number类的泛型上限的方法  此时调用此方法传递的数据必须是 Number类或者其子类
//    格式  ： 类型名称<？ extends 类 > 对象名称
    public static void getElement1(Collection<? extends Number> coll){
        System.out.println("getElement1");
    }
    // 定义Number类的泛型下限的方法  此时调用此方法传递的数据必须是 Number类或者其父类
    public static void getElement2(Collection<? super Number> coll){
        System.out.println("getElement1");
    }




}
