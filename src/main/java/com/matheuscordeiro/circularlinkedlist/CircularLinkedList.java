package com.matheuscordeiro.circularlinkedlist;

public class CircularLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int listSize;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.listSize = 0;
    }

    public void add(T content){
        Node<T> newNode = new Node<>(content);
        if(listSize == 0){
            this.head = newNode;
            this.tail = this.head;
            this.head.setNextNode(this.tail);
        }else{
            newNode.setNextNode(this.tail);
            this.head.setNextNode(newNode);
            this.tail = newNode;
        }
        this.listSize++;
    }

    public void remove(int index){
        if(index >= this.listSize)
            throw new IndexOutOfBoundsException("Index greater than list size");

        Node<T> nodeHelp = tail;
        if(index == 0){
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(tail);
        }else if(index == 1){
            this.tail.setNextNode(this.tail.getNextNode().getNextNode());
        }else{
            for(int i = 0; i < index-1; i++){
                nodeHelp = nodeHelp.getNextNode();
            }
            nodeHelp.setNextNode(nodeHelp.getNextNode().getNextNode());
        }
        this.listSize--;
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("List is empty");

        if(index == 0){
            return this.tail;
        }

        Node<T> nodeHelp = this.tail;
        for(int i = 0; (i < index) && (nodeHelp != null); i++){
            nodeHelp = nodeHelp.getNextNode();
        }
        return nodeHelp;
    }

    public boolean isEmpty(){
        return this.listSize == 0 ? true : false;
    }

    public int size(){
        return this.listSize;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node<T> nodeHelp = this.tail;
        for(int i = 0; i < size(); i++){
            stringReturn += "[Node{content=" + nodeHelp.getContent() +"}]--->";
            nodeHelp = nodeHelp.getNextNode();
        }
        stringReturn += size() != 0 ? "(Return to start)" : "[]";
        return stringReturn;
    }
}

