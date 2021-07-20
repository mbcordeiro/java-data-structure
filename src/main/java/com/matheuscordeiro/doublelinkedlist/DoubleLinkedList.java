package com.matheuscordeiro.doublelinkedlist;

public class DoubleLinkedList<T> {
    private DoubleNode<T> firstNode;
    private DoubleNode<T> lastNode;

    private int listSize = 0;

    public void add(T element){
        DoubleNode<T> newNode = new DoubleNode<T>(element);
        newNode.setNextNode(null);
        newNode.setPreviousNode(lastNode);
        if(firstNode == null){
            firstNode = newNode;
        }
        if(lastNode != null){
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
        listSize++;
    }

    public void add(int index, T element){
        DoubleNode<T> nodeHelp = getNode(index);
        DoubleNode<T> newNode = new DoubleNode<>(element);
        newNode.setNextNode(nodeHelp);

        if(newNode.getPreviousNode() != null){
            newNode.setPreviousNode(nodeHelp.getPreviousNode());
            newNode.getNextNode().setPreviousNode(newNode);
        }else {
            newNode.setPreviousNode(lastNode);
            lastNode = newNode;
        }
        if(index == 0){
            firstNode = newNode;
        }else {
            newNode.getPreviousNode().setNextNode(newNode);
        }
        listSize++;
    }

    public void remove(int index){
        if(index == 0){
            firstNode = firstNode.getNextNode();
            if(firstNode != null){
                firstNode.setPreviousNode(null);
            }
        }else{
            DoubleNode<T> nodeHelp = getNode(index);
            nodeHelp.getPreviousNode().setNextNode(nodeHelp.getNextNode());
            if(nodeHelp != lastNode){
                nodeHelp.getNextNode().setPreviousNode(nodeHelp.getPreviousNode());
            }else{
                lastNode = nodeHelp;
            }
        }
        listSize--;
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    private DoubleNode<T> getNode(int index){
        DoubleNode<T> nodeHelp = firstNode;
        for(int i = 0; (i < index) && (nodeHelp != null); i++){
            nodeHelp = nodeHelp.getNextNode();
        }
        return nodeHelp;
    }

    public int size(){
        return listSize;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        DoubleNode<T> nodeHelp = firstNode;
        for(int i = 0; i < size(); i++){
            stringReturn += "[Node{content=" + nodeHelp.getContent() +"}]--->";
            nodeHelp = nodeHelp.getNextNode();
        }
        stringReturn += "null";
        return stringReturn;
    }
}
