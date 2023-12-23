package edu.citytech.cst3650.datastructure.bst;

import edu.learning.datastructure.java17.custom.model.CompareT;
import edu.learning.datastructure.java17.facade.AbstractDataType;
import edu.learning.datastructure.java17.facade.AbstractNode;
import edu.learning.datastructure.java17.facade.ICalculate;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BinarySearchTree<T> extends AbstractDataType<T> implements ICalculate<T> {
    private int nodeCount = 0;
    private BSTNode<T> root = null;

    public BinarySearchTree(){

    }
    private void incrementSize(){nodeCount++;}

    @Override
    public int updateOne(Predicate<T> predicate, T newValue, Consumer<T> consumerOldValue) {
        this.add(newValue);
        return 1;
    }

    @Override
    public int size(){
        return nodeCount;
    }

    @Override
    public boolean add(T item) {
        this.root = add(root,item);
        incrementSize();
        return true;
    }

    protected BSTNode<T> add(BSTNode<T> node, T item) {
        if(AbstractNode.isEmpty(node)){
            node = new BSTNode<>(null,null,item);
        }
        else if(CompareT.isEqualTo(item, node.getValue())){
            node.setValue(item);
            decrementSize();
        }
        else{
            boolean isLessThan = CompareT.isLessThan(item,node.getValue());
            if(isLessThan){
                node.left = this.add(node.left,item);
            }else{
                node.right = this.add(node.right,item);
            }
        }

        return node;
    }

    @Override
    public void max(BiConsumer<Integer, T> consumer) {
        var metaData = new BSTHelper.MetaData<T>(0,root.getValue());
        var maxMetaData = BSTHelper.max(root, metaData);
        consumer.accept(maxMetaData.operationCount(), maxMetaData.maxValue());
    }

    @Override
    public void min(BiConsumer<Integer, T> consumer) {
        var metaData = new BSTHelper.MetaData<T>(0,root.getValue());
        var minMetaData = BSTHelper.min(root, metaData);
        consumer.accept(minMetaData.operationCount(), minMetaData.maxValue());
    }

    @Override
    public Optional<T> get(T value) {
        var atomicReferance = new AtomicReference<T>();
        boolean wasFound = this.get(value, atomicReferance::set);
        if(wasFound){
            return Optional.of(atomicReferance.get());
        }
        return Optional.empty();
    }

    int inerationCount = 0;

    @Override
    public int iterationCount() {
        return inerationCount;
    }

    private boolean get(T value, Consumer<T> consumer) {
        boolean status = false;
        if(AbstractNode.isEmpty(root))
            return false;
        BSTNode<T> currentNode = root;
        while(!AbstractNode.isEmpty(currentNode)){
            T currentValue = currentNode.getValue();
            boolean isEqual = CompareT.isEqualTo(value, currentValue);
            if(isEqual){
                consumer.accept(currentValue);
                status = true;
                break;
            }else{
                boolean isLessThan = CompareT.isLessThan(value,currentValue);
                if(isLessThan){
                    currentNode=currentNode.left;
                }else{
                    currentNode = currentNode.right;
                }
                inerationCount++;
            }
        }return status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger ai = new AtomicInteger();
        BSTHelper.inOrder(root, data->{
            if(ai.get()>0){
            sb.append(", ");
            }
            sb.append(data);
            ai.incrementAndGet();


        });
        return this.getClass().getSimpleName() + "{" +
                "nodeCount=" + nodeCount +
                ", data=[" + sb.toString() +
                "]}";
    }


    @Override
    public Optional<T> findFirst(T value) {
        return this.get(value);
    }
}
