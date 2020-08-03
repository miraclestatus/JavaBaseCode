package com.china.day12.others;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Eric Lee
 * @date 2020/8/3 21:00
 */
public class MyBirthHowDays {
    public static void main(String[] args) throws ParseException {
        // 计算一个人出生了多少天
        //  在控制台中 请用户输入他的出生年月 1997-07-03
        System.out.println("请输入您的出生日期，格式 yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        //  将用户输入的字符串s转化成日期对象
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birDate = sdf.parse(s);
        long birDateTime = birDate.getTime();
        System.out.println(birDateTime);
        // 计算现在距离标准时间的毫秒数
        Date nowDate = new Date();
        long nowDateTime = nowDate.getTime();
        System.out.println(nowDateTime);

        // 用现在的距离标准时间的毫秒数，减去 出生那天距离标准时间的毫秒数
        long resultTime = nowDateTime - birDateTime;
        // 毫秒数差就是 出生那天距离现在的毫秒数 ， 换算为天
        if (resultTime < 0){
            System.out.println("老铁你逗我呢, 你还没出生呢");
        }else {
           long  birthDays =resultTime/1000/60/60/24;
            System.out.println("你出生了" + birthDays + "天");
        }


    }
}
