package com.matheuscordeiro.circularlinkedlist;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();

        circularLinkedList.add("c0");
        System.out.println(circularLinkedList);

        circularLinkedList.remove(0);
        System.out.println(circularLinkedList);

        circularLinkedList.add("c1");
        System.out.println(circularLinkedList);

        circularLinkedList.add("c2");
        circularLinkedList.add("c3");
        System.out.println(circularLinkedList);

        System.out.println(circularLinkedList.get(7));
        System.out.println(circularLinkedList.get(323));
    }
}

