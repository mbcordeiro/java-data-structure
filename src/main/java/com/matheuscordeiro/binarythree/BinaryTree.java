package com.matheuscordeiro.binarythree;

public class BinaryTree<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T content){
        BinaryNode<T> newNode = new BinaryNode<>(content);
        root = insert(root, newNode);
    }

    private BinaryNode<T> insert(BinaryNode<T> current, BinaryNode<T> newNode){
        if(current == null){
            return newNode;
        }else if(newNode.getContent().compareTo(current.getContent()) < 0){
            current.setLeftNode(insert(current.getLeftNode(), newNode));
        }else{
            current.setRightNode(insert(current.getRightNode(), newNode));
        }
        return current;
    }

    public void displayInOrder(){
        System.out.println("\n display InOrder");
        displayInOrder(this.root);
    }

    private void displayInOrder(BinaryNode<T> current) {
        if(current != null){
            displayInOrder(current.getLeftNode());
            System.out.print(current.getContent() + ", ");
            displayInOrder(current.getRightNode());
        }
    }

    public void displayPostOrder(){
        System.out.println("\n display PostOrder");
        displayPostOrder(this.root);
    }

    private void displayPostOrder(BinaryNode<T> current){
        if(current != null){
            displayPostOrder(current.getLeftNode());
            displayPostOrder(current.getRightNode());
            System.out.print(current.getContent() + ", ");
        }
    }

    public void displayPreOrder(){
        System.out.println("\n displayPreOrder");
        displayPreOrder(this.root);
    }

    private void displayPreOrder(BinaryNode<T> current){
        if(current != null){
            System.out.print(current.getContent() + ", ");
            displayPreOrder(current.getLeftNode());
            displayPreOrder(current.getRightNode());
        }
    }

    public void remover(T content){
        try{
            BinaryNode<T> current = this.root;
            BinaryNode<T> father = null;
            BinaryNode<T> child = null;
            BinaryNode<T> temp = null;

            while (current != null && !current.getContent().equals(content)){
                father = current;
                if(content.compareTo(current.getContent()) < 0){
                    current = current.getLeftNode();
                }else {
                    current = current.getRightNode();
                }
            }

            if(current == null){
                System.out.println("Content not found. Block Try");
            }

            if(father == null){
                if(current.getRightNode() == null){
                    this.root = current.getLeftNode();
                }else if(current.getLeftNode() == null){
                    this.root = current.getRightNode();
                }else {
                    for(temp = current, child  = current.getLeftNode();
                        child .getRightNode() != null;
                        temp = child, child  = child .getLeftNode()
                    ){
                        if(child  != current.getLeftNode()) {
                            temp.setRightNode(child.getLeftNode());
                            child.setLeftNode(root.getLeftNode());
                        }
                    }
                    child.setRightNode(root.getRightNode());
                    root = child;
                }
            }else if(current.getRightNode() == null){
                if(father.getLeftNode() == current){
                    father.setLeftNode(current.getLeftNode());
                }else {
                    father.setRightNode(current.getLeftNode());
                }
            }else if(current.getLeftNode() == null){
                if(father.getLeftNode() == current){
                    father.setLeftNode(current.getRightNode());
                }else {
                    father.setRightNode(current.getRightNode());
                }
            }else{
                for(
                        temp = current, child  = current.getLeftNode();
                        child .getRightNode() != null;
                        temp = child , child  = child .getRightNode()
                ){
                    if(child  != current.getLeftNode()){
                        temp.setRightNode(child .getLeftNode());
                        child .setLeftNode(current.getLeftNode());
                    }
                    child .setRightNode(current.getRightNode());
                    if(father.getLeftNode() == current){
                        father.setLeftNode(child );
                    }else{
                        father.setRightNode(child );
                    }
                }
            }
        }catch (NullPointerException e){
            System.out.println("Content not found. Block Catch");
        }
    }
}
