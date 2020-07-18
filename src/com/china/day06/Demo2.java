package com.china.day06;
/**
 * @author Eric Lee
 * @date 2020/7/18 10:38
 */
public class Demo2 {
    public static void main(String[] args) {

        //java.lang.String lang包下不需要导入
        // 无参构造
        String str = new String();
        // 通过字符数组构造
//        char chars[] = {'a', 'b' , 'c'};
        char[] chars = {'a', 'b' , 'c'};
        String str2 = new String(chars);
        // 通过字节数组构造
        byte bytes[] = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);




    }
}
