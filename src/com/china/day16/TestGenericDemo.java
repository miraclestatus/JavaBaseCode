package com.china.day16;

/**
 * @author Eric Lee
 * @date 2020/8/12 15:49
 */
public class TestGenericDemo {
    public static void main(String[] args) {
        // 在创建对象的时候确定泛型
        // 我要在MyGenericClass基础创建一个 泛型为String类型的泛型类
        MyGenericClass<String> myGenericClass = new MyGenericClass<>();
        myGenericClass.setMvp("库里");
        System.out.println(myGenericClass.getMvp());
        // 更换类型
        MyGenericClass<Integer> myGenericClass1 = new MyGenericClass<>();
        myGenericClass1.setMvp(30);
        System.out.println(myGenericClass1.getMvp());
//        修饰符 <代表泛型的变量> 返回值类型 方法名(参数列表){
//        }

    }
}
