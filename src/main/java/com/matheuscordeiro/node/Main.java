package com.matheuscordeiro.node;

public class Main {
    public static void main(String[] args) {
        //node1 -> node2 -> node3 -> node4 -> null

        Node node1 = new Node("Content node one");
        Node node2 = new Node("Content node two");

        node1.setNextNode(node2);

        Node node3 = new Node("Content node three");

        node2.setNextNode(node3);

        Node node4 = new Node("Content node four");

        node3.setNextNode(node4);

        System.out.println(node1);
        System.out.println(node1.getNextNode());
        System.out.println(node1.getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());
    }
}
