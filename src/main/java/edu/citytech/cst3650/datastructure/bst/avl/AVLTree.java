package edu.citytech.cst3650.datastructure.bst.avl;

import edu.citytech.cst3650.datastructure.bst.BSTNode;
import edu.citytech.cst3650.datastructure.bst.BinarySearchTree;
import edu.learning.datastructure.java17.custom.model.CompareT;
import edu.learning.datastructure.java17.facade.AbstractNode;

import static edu.citytech.cst3650.datastructure.bst.avl.AVLNode.*;

public class AVLTree <T> extends BinarySearchTree<T> {
    public AVLTree(){

    }
    @Override
    protected BSTNode<T> add(BSTNode<T> node, T item) {
        if(AbstractNode.isEmpty(node)){
            node = new BSTNode<>(null,null,item);
        }else{
            boolean isLessThan = CompareT.isLessThan(item, node.getValue());
            if(isLessThan){
                node.setLeftChild(add(node.getLeftChild(), item));
            }else{
                node.setRightChild(add(node.getRightChild(), item));
            }
        }
        node = setBalance(node);
        return node;
    }
    private BSTNode<T> setBalance(BSTNode node){
        int heightL = calculateHeight(node.getLeftChild()), heightR = calculateHeight(node.getRightChild());
        int height = Math.max(heightL,heightR) + 1;
        node.setHeight(height);
        if(isLeftHeavy(node)) {
            if (calculateBalanceFactor(node.getLeftChild()) < 0)
                node.setLeftChild(rotateLeft(node.getLeftChild()));
            return rotateRight(node);
        }
        else if(isRightHeavy(node)) {
            if (calculateBalanceFactor(node.getRightChild()) > 0)
                node.setRightChild(rotateRight(node.getRightChild()));
            return rotateLeft(node);
        }
        return node;

    }


}
