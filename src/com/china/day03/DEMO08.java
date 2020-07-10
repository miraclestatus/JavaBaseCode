package com.china.day03;

/**
 * @author Eric Lee
 * @date 2020/7/8 17:30
 */
public class DEMO08 {
    public static void main(String[] args) {
        int[] score = {95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
        // 获取平均分
        int avg = getAvg(score);
        System.out.println(avg);
        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if(avg < score[i]){
                count++;
            }
        }
        System.out.println(count);
    }

    private static int getAvg(int[] score) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum+=score[i];
        }
        return sum/score.length;
    }
}
