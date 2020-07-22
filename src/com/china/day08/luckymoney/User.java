package com.china.day08.luckymoney;

/**
 * @author Eric Lee
 * @date 2020/7/22 17:31
 */
public class User {
    // 用户名
    private String userName;
    // 余额
    private double leftMoney;

    public User() {
    }

    public User(String userName, double leftMoney) {
        this.userName = userName;
        this.leftMoney = leftMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
    // 展示信息的方法
    public void show(){
        System.out.println("用户"+userName+"余额为"+leftMoney+"元");
    }
}
