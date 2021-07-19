package com.matheuscordeiro.stack;

public class Stack {
    Node refNodeStartStack = null;

    public void push(Node newNode){
        Node refHelp = refNodeStartStack;
        refNodeStartStack = newNode;
        refNodeStartStack.setRefNode(refHelp);
    }

    public Node pop(){
        if(!isEmpty()){
            Node nodePopped = refNodeStartStack;
            refNodeStartStack = refNodeStartStack.getRefNode();
            return nodePopped;
        }
        return null;
    }

    public Node top(){
        return refNodeStartStack;
    }

    public boolean isEmpty(){
        return refNodeStartStack == null ? true : false;
    }

    @Override
    public String toString() {
        String stringReturn = "------------\n";
        stringReturn += "   Stack\n";
        stringReturn += "------------\n";
        Node nodeHelp = refNodeStartStack;
        while(true){
            if(nodeHelp != null){
                stringReturn += "[Node{date=" + nodeHelp.getData() + "}]\n";
                nodeHelp = nodeHelp.getRefNode();
            }else{
                break;
            }
        }
        stringReturn += "============";
        return stringReturn;
    }
}
