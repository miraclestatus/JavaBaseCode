package com.china.day10;

/**
 * @author Eric Lee
 * @date 2020/7/29 17:23
 */
public class Test {
    public static void main(String[] args) {
        String str = "23.456789";
        System.out.println("源字符串" + str);
        // 取整部分
        HandAble s1 =  new HandAble() {
            @Override
            public String handleString(String str) {

                return str.substring(0, str.indexOf("."));
            }
        };
        String s = s1.handleString(str);
        System.out.println("取整后"+s);

        int num = 4;
        HandAble s2 = new HandAble() {
            @Override
            public String handleString(String str) {
                int i = str.indexOf(".") +num + 1; // 小数点后四位
                char c = str.charAt(i);

                if (c <= '4'){
                    return str.substring(0,i).toString();
                }else {
                    char c1 = (char) (str.charAt(str.indexOf(".") +num) + 1);
                    return str.substring(0, i-1) +c1;
                }

            }
        };
        String s3 = s2.handleString(str);
        System.out.println(s3);
    }
}
