package edu.citytech.cst3650.datastructure.heros;

import edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper;
import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.learning.datastructure.java17.data.Hero;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static  org.junit.Assert.assertTrue;

public class T1_DynamicArrayTest extends _MainTest {
    static DynamicArray<Hero> da = new DynamicArray<>(Hero[]::new,10);
    @BeforeEach
    public void addHerosBeforeAll() {
        da.removeAll();
        da.add(heroes);
        print.accept("-".repeat(50));
    }

    @Test
    @DisplayName("(1) add heros")
    public void sizeTest(){
        print.accept(da);
        int expected = 39;
        int actual = da.size();
        assertEquals(expected, actual);


        }
    @Test
    @DisplayName("Remove All")
    public void removeAll(){
        da.removeAll();
        print.accept(da);
        int expected = 0;
        int actual = da.size();
        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("Remove First")
    public void removeFirst(){
        da.removeFirst();
        print.accept(da);
        int expected = 38;
        int actual = da.size();
        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("Remove At")
    public void removeAt(){
        da.removeAt(1);
        print.accept(da);
        int expected = 38;
        int actual = da.size();
        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("get")
    public void equalTo(){
        da.get(9);
        print.accept(da);
        var expected = "batman";
        var actual = da.get(9).get().name();
        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("Remove Frist/get")
    public void equalTo2(){
        removeFirst();
        da.get(9);
        print.accept(da);
        var expected = "wonderwoman";
        var actual = da.get(9).get().name();
        assertEquals(expected, actual);


    }
    }

