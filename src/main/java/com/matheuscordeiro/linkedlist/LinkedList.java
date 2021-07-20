package com.matheuscordeiro.linkedlist;

public class LinkedList<T> {
    private Node<T> referenceStart;

    public LinkedList() {
        this.referenceStart = null;
    }

    public void add(T content){
        Node<T> newNode = new Node(content);
        if(this.isEmpty()){
            referenceStart = newNode;
            return;
        }
        Node<T> nodeHelp = referenceStart;
        for(int i = 0; i < size() - 1; i++){
            nodeHelp = nodeHelp.getNextNode();
        }
        nodeHelp.setNextNode(newNode);
    }

    public T get(int index){
        return getNode(index).getContent();
    }

    private Node<T> getNode(int index){
        validateIndex(index);
        Node<T> nodeHelp = referenceStart;
        Node<T> nodeReturn = null;
        for(int i = 0; i <= index; i++){
            nodeReturn = nodeHelp;
            nodeHelp = nodeHelp.getNextNode();
        }
        return nodeReturn;
    }

    public T remove(int index){
        validateIndex(index);
        Node<T> nodePivot = getNode(index);
        if(index == 0){
            referenceStart = nodePivot.getNextNode();
            return nodePivot.getContent();
        }
        Node<T> nodePrevious = getNode(index - 1);
        nodePrevious.setNextNode(nodePivot.getNextNode());
        return nodePivot.getContent();
    }

    public int size(){
        int listSize = 0;
        Node<T> refHelp = referenceStart;
        while(true){
            if(refHelp != null){
                listSize++;
                if(refHelp.getNextNode() != null){
                    refHelp = refHelp.getNextNode();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return listSize;
    }

    private void validateIndex(int index){
        if(index >= size()){
            int lastIndex = size()-1;
            throw new IndexOutOfBoundsException("There is no content in the index " + index + " of this list. This list only goes to the index. " + lastIndex + '.');
        }
    }

    public boolean isEmpty(){
        return referenceStart == null ? true : false;
    }

    public Node<T> getReferenceStart() {
        return referenceStart;
    }

    public void setReferenceStart(Node<T> referenceStart) {
        this.referenceStart = referenceStart;
    }

    @Override
    public String toString() {
        String stringReturn = "";
        Node<T> nodeHelp = referenceStart;
        for(int i = 0; i < size(); i++){
            stringReturn += "[No{content=" + nodeHelp.getContent() +"}]--->";
            nodeHelp = nodeHelp.getNextNode();
        }
        stringReturn += "null";
        return stringReturn;
    }
}
