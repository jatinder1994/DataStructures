package edu.citytech.cst3650.datastructure.stack;

import edu.citytech.cst3650.datastructure.singleylinkedlist.SingleyLinkedList;
import edu.learning.datastructure.java17.facade.ICalculate;
import edu.learning.datastructure.java17.facade.IStack;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class Stack<T> implements IStack<T>, ICalculate<T> {
    private SingleyLinkedList<T> list = null;
    private IntFunction<T[]> intFunction = null;

    public Stack(IntFunction<T[]> intFunction){
        this.intFunction = intFunction;
        this.list = new SingleyLinkedList<>(intFunction);
    }

    @Override
    public int size() {

        return this.list.size();
    }

    @Override
    public void push(T item) {
        this.list.add(item);

    }

    @Override
    public T pop() {
        if(isEmpty()){
            throw new java.util.EmptyStackException();

        }
        return list.removeFirst();
    }

    @Override
    public T peekFirst() {
        return this.list.getFirstItem().get();
    }

    @Override
    public T peekLast() {
        return this.list.getLastItem().get();
    }

//    @Override
//    public void push(T[] items) {
//        IStack.super.push(items);
//    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public void forEach(Consumer consumer) {
        IStack.super.forEach(consumer);
    }

    @Override
    public void max(BiConsumer<Integer, T> consumer) {
        list.max(consumer);
}

    @Override
    public void min(BiConsumer<Integer, T> consumer) {
        list.min(consumer);
    }
}
