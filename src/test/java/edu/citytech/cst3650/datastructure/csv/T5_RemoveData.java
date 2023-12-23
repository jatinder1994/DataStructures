package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class T5_RemoveData {

    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t1_removeData(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.remove("c");

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t2_removeData(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.remove("b");

        String actual = da.get(1).get();
        String expected = "c";

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t3_removeData(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c","e","d","f");
        da.remove("e");

        String actual = da.get(3).get();
        String expected = "d";

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t4_removeData(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1,2,3);
        da.remove(2);

        int actual = da.get(1).get();
        int expected = 3;

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t5_removeData(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(1,2,3);
        da.remove(2);

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t6_removeData(){
        DynamicArray<Integer> da = new DynamicArray<>(Integer[]::new);
        da.add(0,1,2,3,4,5,6,7,8);
        da.remove(5);

        int actual = da.get(5).get();
        int expected = 6;

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t7_removeData(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("f", "e", "d","c","b","a");
        da.remove("e");

        String actual = da.get(1).get();
        String expected = "d";

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t8_removeData(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("Alex", "Tom", "George","Henry","David","Luke");
        da.remove("Tom");

        String actual = da.get(1).get();
        String expected = "George";

        assertEquals(expected,actual);


    }
    @Test
    @DisplayName("Remove Data by: Jatinder Nijjar")
    public void t9_removeData(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "e", "d","c","b","m");
        da.remove("a");

        int actual = da.size();
        int expected = 5;

        assertEquals(expected,actual);


    }
    @Test
    public void t10_removeData(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("David", "Carl");
        da.remove("Carl");

        int actual = da.size();
        int expected = 1;

        assertEquals(expected,actual);


    }
}
