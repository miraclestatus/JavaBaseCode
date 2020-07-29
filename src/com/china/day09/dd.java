package com.china.day09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Eric Lee
 * @date 2020/7/28 09:28
 */
public class dd {
    public static void main(String[] args) {
        String lastDayOfMonth = getLastDayOfMonth("2020-06");
        System.out.println(lastDayOfMonth);
        int i = LastDay(2020, 06);
        System.out.println(i);
    }
    public static String getLastDayOfMonth(String yearmonth) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
            Date dd = format.parse(yearmonth);
            Calendar cal = Calendar.getInstance();
            cal.setTime(dd);
            int cc=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            String result = yearmonth+"-"+cc;
            return result;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int LastDay(int year , int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();  //清除所有日期数据
        if (year != 0 ) {
            calendar.set(Calendar.YEAR, year);
        }
        calendar.set(Calendar.MONTH, month-1);
        int maxday =calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        return maxday;
    }
}
