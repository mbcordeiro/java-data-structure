package com.matheuscordeiro.queue;

public class Queue<T> {
    private Node<T> refNodeStartQueue = null;


    public Queue() {
        this.refNodeStartQueue = null;
    }
    
    public void enqueue(T object){
        Node<T> newNode = new Node(object);
        newNode.setRefNode(refNodeStartQueue);
        refNodeStartQueue = newNode;
    }

    public T dequeue(){
        if(!isEmpty()){
            Node<T> firstNode = refNodeStartQueue;
            Node<T> nodeHelp = refNodeStartQueue;
            while(true){
                if(firstNode.getRefNode() != null) {
                    nodeHelp = firstNode;
                    firstNode = firstNode.getRefNode();
                }else{
                    nodeHelp.setRefNode(null);
                    break;
                }
            }
            return firstNode.getObject();
        }
        return null;
    }

    public T first(){
        if(!isEmpty()){
            Node<T> firstNode = refNodeStartQueue;
            while(true){
                if(firstNode.getRefNode() != null) {
                    firstNode = firstNode.getRefNode();
                }else{
                    break;
                }
            }
            return firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNodeStartQueue == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node<T> nodeHelp = refNodeStartQueue;

        if(refNodeStartQueue != null){
            while(true){
                stringReturn += "[No{objeto="+ nodeHelp.getObject() +"}]--->";
                if(nodeHelp.getRefNode() != null){
                    nodeHelp = nodeHelp.getRefNode();
                }else{
                    stringReturn += "null";
                    break;
                }
            }
        }else{
            stringReturn = "null";
        }

        return stringReturn;
    }
}
