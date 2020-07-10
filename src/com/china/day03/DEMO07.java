package com.china.day03;

/**
 * @author Eric Lee
 * @date 2020/7/8 17:13
 */
public class DEMO07 {
    public static void main(String[] args) {
        String[] hs  = {"黑桃","红桃","梅花","方片"};
        // 点数数组
        String[] ds = {"A","2","3","4", "5","6","7","8","9","10","J","Q","K"};

        printCard(hs, ds);

    }
    public static void printCard(String[] hs , String[] ds){
        for (int i = 0; i < hs.length; i++) {
            for (int j = 0; j < ds.length; j++) {
                // hs + ds
                System.out.print(hs[i] + ds[j] + "\t");
            }
            System.out.println();
        }
    }

}
