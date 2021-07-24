package com.matheuscordeiro.binarythree.models;

import java.util.Objects;

public class MyObject extends ObjectTree<MyObject> {
    Integer myValue;

    public MyObject(Integer myValor) {
        this.myValue = myValor;
    }

    @Override
    public boolean equals(MyObject object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyObject myObject = (MyObject) object;
        return Objects.equals(myValue, myObject.myValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myValue);
    }

    @Override
    public int compareTo(MyObject other) {
        int i = 0;
        if(this.myValue > other.myValue){
            i = 1;
        }else if(this.myValue < other.myValue){
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return myValue.toString();
    }
}
