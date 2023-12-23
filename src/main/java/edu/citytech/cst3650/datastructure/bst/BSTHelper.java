package edu.citytech.cst3650.datastructure.bst;

import java.util.function.Consumer;

public class BSTHelper {
    record MetaData<T>(int operationCount, T maxValue){}
    static <T> MetaData<T> max(BSTNode<T> node, MetaData<T> metaData){
        if(BSTNode.isEmpty(node)){
            return metaData;
        }
        int operationCount = metaData.operationCount()+1;
        var currentData = new MetaData<T>(operationCount, node.getValue());
        var maxData = max(node.right, currentData);
        return maxData;
    }
    static <T> MetaData<T> min(BSTNode<T> node, MetaData<T> metaData){
        if(BSTNode.isEmpty(node)){
            return metaData;
        }
        int operationCount = metaData.operationCount()+1;
        var currentData = new MetaData<T>(operationCount, node.getValue());
        var minData = min(node.left, currentData);
        return minData;
    }

    public static <T> void inOrder(BSTNode<T> node, Consumer<T> consumer){

        if(BSTNode.isEmpty(node)){
            return;
        }
        inOrder(node.left, consumer);
        consumer.accept(node.getValue());
        inOrder(node.right, consumer);

    }
}
