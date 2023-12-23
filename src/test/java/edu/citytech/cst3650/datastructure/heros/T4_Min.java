package edu.citytech.cst3650.datastructure.heros;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;

public class T4_Min {
    @Test
    public void t1Min(){
        Integer[] items = {64, 25000, 12, 1000, 110};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 12;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t2Min(){
        String[] items = {"A", "B", "C", "D", "E"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.min((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "A";
        assertEquals(expected, actual);
    }
    @Test
    public void t3Min(){
        Integer[] items = {1,2,3,4};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 1;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t4Min(){
        String[] items = {"Z", "Y", "X", "W", "V"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.min((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "V";
        assertEquals(expected, actual);
    }
    @Test
    public void t5Min(){
        Integer[] items = {92, 23, 34, 4, 445};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 4;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t6Min(){
        String[] items = {"O", "G", "K", "P", "Q"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.min((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "G";
        assertEquals(expected, actual);
    }
    @Test
    public void t7Min(){
        Integer[] items = {900, 800, 700, 600, 500};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 500;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t8Min(){
        String[] items = {"P", "X", "B", "N", "E"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.min((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "B";
        assertEquals(expected, actual);
    }
    @Test
    public void t9Min(){
        Integer[] items = {11, 12, 13, 14, 15};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 11;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t10Min(){
        String[] items = {"X", "H", "W", "P", "M"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.min((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "H";
        assertEquals(expected, actual);
    }
    @Test
    public void t11Min(){
        Integer[] items = {64, 12, 12, 100, 120};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.min((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 12;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t12Min(){
        String[] items = {"A", "A", "C", "D", "E"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.min((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "A";
        assertEquals(expected, actual);
    }
}
