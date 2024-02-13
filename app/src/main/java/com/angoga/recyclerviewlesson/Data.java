package com.angoga.recyclerviewlesson;

public class Data {
    private int number;

    public Data(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void add(int num) {
        this.number += num;
    }
}
