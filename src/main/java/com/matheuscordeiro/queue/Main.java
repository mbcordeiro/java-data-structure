package com.matheuscordeiro.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");
        queue.enqueue("Fourth");

        System.out.println(queue);
        System.out.println(queue.dequeue());

        queue.enqueue("Last");
        System.out.println(queue);
        System.out.println(queue.first());
    }
}
