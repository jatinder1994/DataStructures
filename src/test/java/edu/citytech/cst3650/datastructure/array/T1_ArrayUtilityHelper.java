package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static  org.junit.Assert.*;

@DisplayName("Array UtilityHelper by Nijjar, Jatinder")
public class T1_ArrayUtilityHelper {
    @Test
    public void t1_size(){
        String[] m1 = {"n1", "n2", "n3"};
        int actual = ArrayUtilityHelper.size(m1);
        int expected = 3;

        assertEquals(expected,actual);

    }
    @Test
    public void t2_size(){
        Integer[] m1 = {1, 2, 3, 4,5};
        int actual = ArrayUtilityHelper.size(m1);
        int expected = 5;

        assertEquals(expected,actual);

    }
    @Test
    public void t3_size(){
        int acutal = ArrayUtilityHelper.size();
        int expected = 0;

        assertEquals(expected,acutal);
    }
    @Test
    public void t4_size(){
        Integer[] m1 = {1,2,3,4,5};
        Integer[] m2 = {1,2,3,4,5,6,7,8};

        int acutal = ArrayUtilityHelper.size(m1, m2);
        int expected = 13;
        assertEquals(expected,acutal);
    }
}
