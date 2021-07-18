package com.matheuscordeiro.referenceassignment;

public class MyObject {
    Integer num;

    public MyObject() {

    }

    public MyObject(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
