package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class T3_RemoveFirst {
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t1_removeFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeFirst();

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t2_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1, 2, 3);
        da.removeFirst();

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t3_removeFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeFirst();

        String actual = String.valueOf(da.get(0).get());
        String expected = "b";

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t4_removeFirst(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1,2,3);
        da.removeFirst();

        int actual = (da.get(0).get());
        int expected = 2;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t5_removeFirst(){
        DynamicArray<Double> da = new DynamicArray<>(Double[]::new);
        da.add(1.0, 1.1, 1.2);
        da.removeFirst();

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t6_removeFirst(){
        DynamicArray<Double> da = new DynamicArray<>(Double[]::new);
        da.add(1.0, 1.1, 1.2);
        da.removeFirst();

        Double actual = da.get(0).get();
        Double expected = 1.1;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t7_removeFirst(){
        DynamicArray<Character> da = new DynamicArray<>(Character[]::new);
        da.add('a', 'b', 'c');
        da.removeFirst();

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t8_removeFirst(){
        DynamicArray<Character> da = new DynamicArray<>(Character[]::new);
        da.add('a', 'b', 'c');
        da.removeFirst();

        char actual = da.get(0).get();
        char expected = 'b';

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t9_removeFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c","d", "f");
        da.removeFirst();

        int actual = da.size();
        int expected = 4;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove First Index by: Jatinder Nijjar")
    public void t10_removeFirst(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c","d", "f");
        da.removeFirst();

        String actual = da.get(0).get();
        String expected = "b";

        assertEquals(expected,actual);

        System.out.println(da);

    }


}
