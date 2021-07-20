package com.matheuscordeiro.doublelinkedlist;

public class Main<T> {
    public static void main(String[] args) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();

        doubleLinkedList.add("c1");
        doubleLinkedList.add("c2");
        doubleLinkedList.add("c3");
        doubleLinkedList.add("c4");
        doubleLinkedList.add("c5");
        doubleLinkedList.add("c6");
        doubleLinkedList.add("c7");

        System.out.println(doubleLinkedList);

        doubleLinkedList.remove(3);
        doubleLinkedList.add(3, "99");

        System.out.println(doubleLinkedList);
        System.out.println(doubleLinkedList.get(3));
    }
}
