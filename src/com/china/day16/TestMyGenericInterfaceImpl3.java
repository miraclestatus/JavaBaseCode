package com.china.day16;

/**
 * @author Eric Lee
 * @date 2020/8/12 16:15
 */
public class TestMyGenericInterfaceImpl3 {
    public static void main(String[] args) {
        MyGenericInterfaceImpl3<String> impl3 = new MyGenericInterfaceImpl3();
        MyGenericInterfaceImpl3<Integer> impl4 = new MyGenericInterfaceImpl3();
        impl3.add("dad");
//        impl3.add(121);
        impl4.add(112);


    }
}
