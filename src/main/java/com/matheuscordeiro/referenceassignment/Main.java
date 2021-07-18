package com.matheuscordeiro.referenceassignment;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        MyObject objectA = new MyObject(1);
        MyObject objectB = objectA;

        System.out.println("objectA = " + objectB + " objectB = " + objectB);
        objectA.setNum(2);
        System.out.println("objectA = " + objectB + " objectB = " + objectB);

    }
}
