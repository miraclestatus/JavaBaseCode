package com.china.day09.dizhu;

/**
 * @author Eric Lee
 * @date 2020/7/29 11:04
 */
public class Poker {
    private String color;
    private String number;
    private int grade;
    boolean isLandowners;

    public boolean isLandowners() {
        return isLandowners;
    }

    public void setLandowners(boolean landowners) {
        isLandowners = landowners;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Poker() {
    }

    public Poker(String color, String number ,int grade,boolean isLandowners) {
        this.color = color;
        this.number = number;
        this.grade=grade;
        this.isLandowners=isLandowners;
    }


    public String toString() {
        return this.getColor()+this.getNumber();
    }
}
