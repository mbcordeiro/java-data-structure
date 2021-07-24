package com.matheuscordeiro.binarythree;

import com.matheuscordeiro.binarythree.models.MyObject;

public class Main {
    public static void main(String[] args){

        BinaryTree<MyObject> tree = new BinaryTree<>();

        tree.insert(new MyObject(13));
        tree.insert(new MyObject(10));
        tree.insert(new MyObject(25));
        tree.insert(new MyObject(2));
        tree.insert(new MyObject(12));
        tree.insert(new MyObject(20));
        tree.insert(new MyObject(31));
        tree.insert(new MyObject(29));
        tree.insert(new MyObject(32));
        tree.remove(new MyObject(32));

        tree.displayInOrder();
        tree.displayPreOrder();
        tree.displayPostOrder();

    }
}
