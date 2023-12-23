package edu.citytech.cst3650.datastructure.array;

import edu.learning.datastructure.java17.facade.AbstractList;
import edu.learning.datastructure.java17.facade.AbstractNode;

import static edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper.*;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;


public class DynamicArray <T> extends AbstractList<T> {

    public DynamicArray(IntFunction<T[]> intFunction) {


        super.items = intFunction.apply(super.allocatedSize);
        super.intFunction = intFunction;
    }

    public DynamicArray(IntFunction<T[]> intFunction, int size) {

        if (size == 0) {

            size = 1;
        }
        super.allocatedSize = size;
        super.items = intFunction.apply(size);
        super.intFunction = intFunction;

    }

    @Override
    public boolean add(T item) {


        incrementSize();
        if (super.allocatedSize == 0) {
            super.allocatedSize = 1;
            super.items = super.intFunction.apply(super.allocatedSize);
        }
        if (super.allocatedSize < size()) {
            allocatedSize = allocatedSize * 2;
            super.items = allocateMoreData(super.intFunction, super.items, super.allocatedSize);
        }

        super.items[super.index++] = item;

        return true;
    }


    @Override
    public Optional<T> get(int index) {
        Optional optional = Optional.empty();
        if (size() > index) {
            optional = Optional.of(items[index]);
        }
        return optional;
    }

    @Override
    public T[] toArray() {
        T[] data = intFunction.apply(size());
        for (int i = 0; i < data.length; i++) {
            data[i] = (T) super.items[i];
        }

        return data;
    }

    @Override
    public void removeAll() {
        this.items = this.intFunction.apply(0);
        this.resetSize();
        this.allocatedSize = 0;
        this.index = 0;

    }

    @Override
    public String toString() {
        return ArrayUtilityHelper.toString(this.toArray());
    }

    @Override
    public T removeAt(int index) {
        T deleteItem = items[index];
        items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, index);
        decrementSize();
        return deleteItem;
    }

    @Override
    public T removeFirst() {
        items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, 0);
        decrementSize();
        return super.removeFirst();
    }

    @Override
    public T removeLast() {
        items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, size() - 1);
        decrementSize();

        return super.removeLast();
    }

    @Override
    public boolean remove(T data) {
        int count = 0;
        int indexNumber = -1;
        for (T item : items) {
            if (item == data) {
                indexNumber = count;

            }
            count++;

        }
        if (indexNumber != -1) {
            items = ArrayUtilityHelper.removeByIndex(super.intFunction, items, indexNumber);
            decrementSize();
        }
        return super.remove(data);
    }

    @Override
    public void max(BiConsumer<Integer, T> consumer) {
        int length = super.size();
        double maxValue = 0;
        String maxChar = null;
        T value;
        T value2 = null;
        int i = 0;
        for (; i < length; i++) {
            value = super.items[i];
            if (value instanceof Integer aNumber) {
                if (aNumber > maxValue) {
                    maxValue = aNumber;
                    value2 = items[i];


                }
            } else if (value instanceof String aString) {
                if (maxChar == null || aString.compareTo(maxChar) > 0) {
                    maxChar = aString;
                    value2 = items[i];
                }
            }

        }
        consumer.accept(i, value2);
    }

    @Override
    public void min(BiConsumer<Integer, T> consumer) {
        int length = super.size();
        double minValue = 0;
        String maxChar = null;
        T value;
        T value2 = null;
        T valueCheck = items[0];
        if(valueCheck instanceof Number) {
            minValue = (Integer) items[0];
            value2 = items[0];
        }

        int i = 0;
        for (; i < length; i++) {
            value = super.items[i];
            if (value instanceof Integer aNumber) {

                if (aNumber < minValue) {
                    minValue = aNumber;
                    value2 = items[i];


                }
            } else if (value instanceof String aString) {
                if (maxChar == null || aString.compareTo(maxChar) < 0) {
                    maxChar = aString;
                    value2 = items[i];
                }
            }

        }
        consumer.accept(i, value2);

    }
    @Override
    public void filter(Predicate<T> predicate, Consumer<T> consumer) {
        for (T item: items) {
            if(item==null){
                break;
            }else{
            boolean isTrue = predicate.test(item);
            if(isTrue){
                consumer.accept(item);
            }

        }}

    }
}
