package edu.citytech.cst3650.datastructure.bst.avl;

import edu.citytech.cst3650.datastructure.bst.BSTNode;

public class AVLNode <T> extends BSTNode<T> {
    public AVLNode(BSTNode<T> left, BSTNode<T> right, T value) {
        super(left, right, value);
    }
    public static <T> int calculateHeight(BSTNode node){
        return BSTNode.isEmpty(node) ? -1: node.getHeight();
    }

    public static <T> boolean isLeftHeavy(BSTNode<T> node){
        return calculateBalanceFactor(node) >1;
    }
    public static <T> boolean isRightHeavy(BSTNode<T> node){
        return calculateBalanceFactor(node) < -1;
    }

    public static <T> int calculateBalanceFactor(BSTNode<T> node){
        return isEmpty(node) ? 0 : calculateHeight(node.getLeftChild()) - calculateHeight(node.getRightChild());
    }
    public static <T> BSTNode<T> rotateLeft(BSTNode<T> node){
        var newNode =node.getRightChild();
        node.setRightChild(newNode.getLeftChild());
        newNode.setLeftChild(node);
        updateHeight(node);
        updateHeight(newNode);
        return newNode;
    }
    public static <T> BSTNode<T> rotateRight(BSTNode<T> node){
        var newNode =node.getLeftChild();
        node.setLeftChild(newNode.getRightChild());
        newNode.setRightChild(node);
        updateHeight(node);
        updateHeight(newNode);
        return newNode;
    }
    private static <T>  void updateHeight(BSTNode<T> node){
        int heightL = isEmpty(node.getLeftChild()) ? -1 : node.getLeftChild().getHeight();
        int heightR = isEmpty(node.getRightChild()) ? -1 : node.getRightChild().getHeight();
        int height = Math.max(heightL, heightR)+1;
        node.setHeight(height);

    }

}
