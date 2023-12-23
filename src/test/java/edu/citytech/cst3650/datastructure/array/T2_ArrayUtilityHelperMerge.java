package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
@DisplayName("Merge")
public class T2_ArrayUtilityHelperMerge {
    @Test
    @DisplayName("1. merge and size")
    public void t1_merge(){
        Integer[] m1 = {1,2,3,4,5};
        Integer[] m2 = {1,2,3,4,5,6,7,8};
        Integer[] m3 = {9,10};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2, m3);
        int expected = 15;
        assertEquals(expected,actual.length);
    }
    @Test
    @DisplayName("2. merge and size")
    public void t2_merge(){
        Integer[] m1 = {1,2,3,4,5};
        Integer[] m2 = {6,7};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2);
        int expected = 7;
        assertEquals(expected,actual.length);
    }
    @Test
    @DisplayName("3. merge and size")
    public void t3_merge(){
        Integer[] m1 = {1,2,3,4,5};
        Integer[] m2 = {6,7};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 7;
        assertEquals(expected,actual[actual.length-1]);
    }
    @Test
    @DisplayName("4. merge and size")
    public void t4_merge(){
        Integer[] m1 = {1,2,3,4,10};
        Integer[] m2 = {6,7};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 10;
        System.out.println(ArrayUtilityHelper.toString(actual));
        assertEquals(expected,actual[4]);
    }
    @Test
    @DisplayName("5. merge and size for string")
    public void t5_merge(){
        Integer[] m1 = {1,2,3,4,10};
        Integer[] m2 = {6,7};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2);
        System.out.println(ArrayUtilityHelper.toString(actual));
        Integer expected = 3;
        assertEquals(expected,actual[2]);
    }
    @Test
    @DisplayName("6. merge and size")
    public void t6_merge(){
        String[] m1 = {"A", "B", "C"};
        String[] m2 = {"D","E", "F"};

        String[] actual = ArrayUtilityHelper.merge(m1, m2);
        System.out.println(ArrayUtilityHelper.toString(actual));
        String expected = "F";
        assertEquals(expected,actual[5]);
    }
    @Test
    @DisplayName("7. merge and size")
    public void t7_merge(){
        String[] m1 = {"A", "B", "C"};
        String[] m2 = {"D","E", "F", "G"};

        String[] actual = ArrayUtilityHelper.merge(String[]:: new, m1, m2);
        System.out.println(ArrayUtilityHelper.toString(actual));
        String expected = "G";
        assertEquals(expected,actual[6]);
    }
    @Test
    @DisplayName("8. merge and size")
    public void t8_merge(){
        Integer[] m1 = {1,2,3,4,10};
        Integer[] m2 = {6,7};
        Integer[] m3 = {1,2,3,4,10};
        Integer[] m4 = {6,7};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2,m3,m4);
        int expected = 14;
        assertEquals(expected,actual.length);
    }
    @Test
    @DisplayName("9. merge and size")
    public void t9_merge(){
        Integer[] m1 = {1,2,3,4,10};
        Integer[] m2 = {6,7};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 7;
        assertEquals(expected,actual[6]);
    }
    @Test
    @DisplayName("10. merge and size")
    public void t10_merge(){
        Integer[] m1 = {1,2,3,4,10};
        Integer[] m2 = {6,7};

        Integer[] actual = ArrayUtilityHelper.merge(m1, m2);
        Integer expected = 6;
        assertEquals(expected,actual[5]);
    }

}
