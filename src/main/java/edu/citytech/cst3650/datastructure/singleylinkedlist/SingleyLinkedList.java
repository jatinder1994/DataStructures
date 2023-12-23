package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.learning.datastructure.java17.custom.model.CompareT;
import edu.learning.datastructure.java17.facade.AbstractLinkedList;
import edu.learning.datastructure.java17.facade.AbstractNode;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class SingleyLinkedList<T> extends AbstractLinkedList<T> {

    private AbstractNode<T> first;
    private AbstractNode<T> last;

    public SingleyLinkedList(IntFunction<T[]> intFunction) {
        super.intFunction = intFunction;
        super.items = intFunction.apply(0);


    }
    public SingleyLinkedList() {



    }

    @Override
    public boolean add(T item) {
        incrementSize();
        var node = new Node<T>(item);
        if(AbstractNode.isEmpty(first)){
            first = last = node;
        }else{
            last.setNext(node);
            last = node;
        }
        return true;
    }

    @Override
    protected AbstractNode<T> getFirstNode() {
        return first;
    }

    @Override
    public Optional<T> getFirstItem() {
        if(AbstractNode.isEmpty(first)){
            return Optional.empty();
        }else{
            T value = first.getValue();
            return Optional.of(value);
        }

    }

    @Override
    public Optional<T> getLastItem() {
        if(AbstractNode.isEmpty(last)){
            return Optional.empty();
        }else{
            T value = last.getValue();
            return Optional.of(value);
        }

    }

    @Override
    public T removeFirst() {
        if(AbstractNode.isEmpty(first))
            throw new NoSuchElementException("No more Data size is: " + this.size());
        super.decrementSize();
        if(this.first==this.last){
            first = last = null;
            return null;
        }
        AbstractNode<T> secondNode = this.first.getNext();
        first.setNext(null);
        first = secondNode;
        return first.getValue();
    }

    @Override
    public T removeLast() {
        if(AbstractNode.isEmpty(first))
            throw new NoSuchElementException(this.getClass().getSimpleName() + "No more Data size is: " + this.size());
        decrementSize();
        if (first==last){
            first = last = null;
            return null;

        }
        AbstractNode<T>  nextToLastNode = this.getPreviousNode(this.first, this.last);
        T value = last.getValue();
        last = nextToLastNode;
        last.setNext(null);
        return value;
    }

    private AbstractNode<T> getPreviousNode(AbstractNode<T> first, AbstractNode<T> node){
        AbstractNode<T>  current = first;
        while (current != null){
            if(current.getNext()==node)
                return current;


        }

        return null;
    }



    @Override
    public void removeAll() {
        first = last = null;
        resetSize();

    }

    @Override
    public void filter(Predicate<T> predicate, Consumer<T> consumer) {
        AbstractNode<T> current = first;
        operationCount = 0;
        while (current != null){
            operationCount++;
            boolean isTrue = predicate.test(current.getValue());
            if(isTrue){
                consumer.accept(current.getValue());
            }
            current = current.getNext();
        }
    }

    private int operationCount, iterationCount;
    @Override
    public Optional<T> findFirst(T value) {
        AbstractNode<T> current = first;
        operationCount = 0;
        iterationCount = 0;

        while (current != null){
            operationCount++;
            iterationCount++;
            T t2 = current.getValue();
            boolean isTrue = CompareT.isEqualTo(value, t2);
            if(isTrue){
                return Optional.of(current.getValue());
            }
            current = current.getNext();


        }
        return Optional.empty();
    }

    @Override
    public int iterationCount() {
        return iterationCount;
    }



    @Override
    public long getOperationCount(){
        return  this.getOperationCount();
    }

    @Override
    public int updateOne(Predicate<T> predicate, T newValue, Consumer<T> consumerOldValue) {
        AbstractNode<T> current = first;
        operationCount = 0;
        int status = 0;
        while (current != null){
            operationCount++;
            boolean isTrue = predicate.test(current.getValue());
            if(isTrue){
                consumerOldValue.accept(current.getValue());
                current.setValue(newValue);
                status++;
                return status;
            }
            current = current.getNext();
        }
        this.add(newValue);
        return status;
    }

    @Override
    public void max(BiConsumer<Integer, T> consumer) {

        boolean isComparable = first!=null && (first.getValue() instanceof Comparable);
        if(!isComparable)
            return;
        var current = first;
        Comparable maxValue = (Comparable)current.getValue();
        int maxIndex = 0;
        while(current != null){
            Comparable currentValue = (Comparable)current.getValue();
            int status = currentValue.compareTo(maxValue);
            if(status >0){
                maxIndex = index;
                maxValue = currentValue;
            }
            current = current.getNext();
            maxIndex ++;
        }
        consumer.accept(maxIndex, (T)maxValue);

    }

    @Override
    public void min(BiConsumer<Integer, T> consumer) {
        boolean isComparable = first!=null && (first.getValue() instanceof Comparable);
        if(!isComparable)
            return;
        var current = first;
        Comparable minValue = (Comparable)current.getValue();
        int maxIndex = 0;
        while(current != null){
            Comparable currentValue = (Comparable)current.getValue();
            int status = currentValue.compareTo(minValue);
            if(status < 0){
                maxIndex = index;
                minValue = currentValue;
            }
            current = current.getNext();
            maxIndex ++;
        }
        consumer.accept(maxIndex, (T)minValue);
    }
}
