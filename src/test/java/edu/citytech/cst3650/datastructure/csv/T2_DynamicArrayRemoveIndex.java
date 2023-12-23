package edu.citytech.cst3650.datastructure.csv;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.citytech.cst3650.datastructure.model.SimpleStock;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T2_DynamicArrayRemoveIndex {
    @Test
    @DisplayName("Remove by Index by: Jatinder Nijjar")
    public void t1_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeAt(1);

        Optional<String> actual = da.get(1);
        String expected = "c";
        assertEquals(expected,actual.get());

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove by Index by: Jatinder Nijjar")
    public void t2_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeAt(1);

        int actual = da.size();
        int expected = 2;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove by Index by: Jatinder Nijjar")
    public void t3_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeAt(0);
        da.removeAt(0);
        da.removeAt(0);

        int actual = da.size();
        int expected = 0;

        assertEquals(expected,actual);

        System.out.println(da);

    }
    @Test
    @DisplayName("Remove by Index by: Jatinder Nijjar")
    public void t4_removeIndex(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new);
        da.add("a", "b", "c");
        da.removeAt(0);
        da.removeAt(0);
        da.removeAt(0);
        da.add("z");

        int actual = da.size();
        int expected = 1;

        assertEquals(expected,actual);

        System.out.println(da);

    }


}
