package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class T4_RemoveLast {
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t1_removeLastIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeLast();

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t2_removeLastIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeLast();

        String actual = da.get(da.size()-1).get();
        String expected = "b";

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t3_removeLastIndex(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1,2,3);
        da.removeLast();

        int actual = da.get(da.size()-1).get();
        int expected = 2;

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t4_removeLastIndex(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1,2,3);
        da.removeLast();

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t5_removeLastIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c","d","e");
        da.removeLast();

        int actual = da.size();
        int expected =4;

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t6_removeLastIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c","d","e");
        da.removeLast();

        String actual = da.get(da.size()-1).get();
        String expected = "d";

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t7_removeLastIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("Aaron", "George", "Zack");
        da.removeLast();

        String actual = da.get(da.size()-1).get();
        String expected = "George";

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t8_removeLastIndex(){
        DynamicArray<Double> da = new DynamicArray<>(Double[]::new);
        da.add(1.1,1.2,1.2);
        da.removeLast();

        Double actual = da.get(da.size()-1).get();
        Double expected = 1.2;

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t9_removeLastIndex(){
        DynamicArray<Double> da = new DynamicArray<>(Double[]::new);
        da.add(1.1,1.2,1.2);
        da.removeLast();

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);



    }
    @Test
    @DisplayName("Remove Last Index by: Jatinder Nijjar")
    public void t10_removeLastIndex(){
        DynamicArray<Double> da = new DynamicArray<>(Double[]::new);
        da.add(1.1,1.2,1.2,1.3,1.4);
        da.removeLast();

        int actual = da.size();
        int expected = 4;

        assertEquals(expected,actual);



    }

}
