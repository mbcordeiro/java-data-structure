package com.matheuscordeiro.circularlinkedlist;

public class Node<T> {
    private T content;
    private Node<T> nextNode = null;

    public Node () {

    }

    public Node(T content) {
        this.content = content;
    }

    public Node(T content, Node<T> nextNode) {
        this.content = content;
        this.nextNode = nextNode;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "No{" + content + '}';
    }

    public String toStringLinked() {
        String str = "No{" + content + "}";

        if(nextNode != null){
            str += "->" + nextNode.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}

