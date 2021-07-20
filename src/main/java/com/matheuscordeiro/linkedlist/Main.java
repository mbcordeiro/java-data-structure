package com.matheuscordeiro.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Test 1");
        linkedList.add("Test 2");
        linkedList.add("Test 3");
        linkedList.add("Test 4");

        System.out.println(linkedList);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.remove(3));
        System.out.println(linkedList);
    }
}
