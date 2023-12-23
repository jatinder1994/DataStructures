package edu.citytech.cst3650.datastructure.heros;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.atomic.AtomicReference;

public class T3_Max extends _MainTest {
    @Test
    public void t1Max(){
        Integer[] items = {64, 25000, 12, 1000, 110};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 25000;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t2Max(){
        String[] items = {"A", "B", "C", "Z", "X"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.max((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "Z";
        assertEquals(expected, actual);
    }
    @Test
    public void t3Max(){
        Integer[] items = {1, 2, 3, 4, 5};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 5;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t4Max(){
        String[] items = {"Z", "Y", "X", "W", "V"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.max((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "Z";
        assertEquals(expected, actual);
    }
    @Test
    public void t5Max(){
        Integer[] items = {1000, 900, 800, 700, 600};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 1000;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t6Max(){
        String[] items = {"A", "B", "C", "D", "E"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.max((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "E";
        assertEquals(expected, actual);
    }
    @Test
    public void t7Max(){
        Integer[] items = {122, 222, 3333, 422, 53};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 3333;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t8Max(){
        String[] items = {"L", "G", "O", "N", "A"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.max((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "O";
        assertEquals(expected, actual);
    }
    @Test
    public void t9Max(){
        Integer[] items = {1,34,56,77};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 77;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t10Max(){
        String[] items = {"A", "V", "L", "Y", "A"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.max((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "Y";
        assertEquals(expected, actual);
    }
    @Test
    public void t11Max(){
        Integer[] items = {1,1,1,1};
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new);
        AtomicReference<Integer> atomicReference = new AtomicReference<>();

        dynamicArray.add(items);

        dynamicArray.max((Integer index,Integer value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = 1;
        assertEquals(expected, actual, 0f);
    }
    @Test
    public void t12Max(){
        String[] items = {"V", "V", "V", "V", "V"};
        DynamicArray<String> dynamicArray = new DynamicArray<>(String[]::new);
        AtomicReference<String> atomicReference = new AtomicReference<>();
        dynamicArray.add(items);
        dynamicArray.max((index,value) -> {
            atomicReference.set(value);
        });
        var actual = atomicReference.get();
        var expected = "V";
        assertEquals(expected, actual);
    }

}
