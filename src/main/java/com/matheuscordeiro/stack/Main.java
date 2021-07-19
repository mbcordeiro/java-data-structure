package com.matheuscordeiro.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.push(new Node(4));
        stack.push(new Node(5));
        stack.push(new Node(6));

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        stack.push(new Node(7));

        System.out.println(stack);
    }
}
