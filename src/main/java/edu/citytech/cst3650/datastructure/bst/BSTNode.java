package edu.citytech.cst3650.datastructure.bst;

import edu.learning.datastructure.java17.facade.AbstractNode;

public class BSTNode<T> extends AbstractNode<T> {
    BSTNode<T> left, right;
    private int height;

    public BSTNode(BSTNode<T> left, BSTNode<T> right, T value) {
        super.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "BSTNode[height=" +height+
                ", data=" + value +
                "left=" + isNull(left, "N/A")+
                ", right=" + isNull(right, "N/A")+

                ']';
    }
    private static <T> String isNull(AbstractNode<T> node, String message){
        return node == null ? message: node.getValue().toString();

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BSTNode<T> getLeftChild() {
        return left;
    }

    public void setLeftChild(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRightChild() {
        return right;
    }

    public void setRightChild(BSTNode<T> right) {
        this.right = right;
    }
}
