package com.china.day09.dizhu;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Eric Lee
 * @date 2020/7/29 11:05
 */
public class Player {
    private ArrayList<Poker> pokers; // 初始牌集合
    private boolean isLandower;         // 是否地主
    private ArrayList<Poker> newPokers; // 排序后牌集合
    private LinkedList<Integer> grades; // 牌值集合

    public LinkedList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(LinkedList<Integer> grades) {
        this.grades = grades;
    }

    public ArrayList<Poker> getNewPokers() {
        return newPokers;
    }

    public void setNewPokers(ArrayList<Poker> newPokers) {
        this.newPokers = newPokers;
    }

    public boolean isLandower() {
        return isLandower;
    }

    public void setLandower(boolean landower) {
        isLandower = landower;
    }

    public Player() {
    }

    public ArrayList<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(ArrayList<Poker> pokers) {
        this.pokers = pokers;
    }
}
