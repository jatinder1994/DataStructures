package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;

import static edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper.*;

import static org.junit.Assert.assertEquals;

@DisplayName("Array UtilityHelper Copy Range by Nijjar, Jatinder")
public class T3_ArrayUtilityHelperCopRange {
    @Test
    public void t1_size(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = copyRange(String[]::new, data,1, 3);
        System.out.println(ArrayUtilityHelper.toString(newData));
        int expected = 3;
        int actual = newData.length;
        assertEquals(expected, actual);


    }
    @Test
    public void t2_lastElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = copyRange(String[]::new, data,1, 4);
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n5";
        var actual = newData[newData.length-1];
        assertEquals(expected, actual);


    }
    @Test
    public void t3(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "7", "n8"};
        String[] newData = copyRange(String[]::new, data,1, 6);
        System.out.println(ArrayUtilityHelper.toString(newData));
        int expected = 6;
        int actual = newData.length;
        assertEquals(expected, actual);



    }
    @Test
    public void t4_secondLastElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8"};
        String[] newData = copyRange(String[]::new, data,1, 7);
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n7";
        var actual = newData[newData.length-2];
        assertEquals(expected, actual);


    }
    @Test
    public void t5_firstElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8"};
        String[] newData = copyRange(String[]::new, data,0, 7);
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n1";
        var actual = newData[0];
        assertEquals(expected, actual);


    }
    @Test
    public void t6_secondElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8"};
        String[] newData = copyRange(String[]::new, data,0, 7);
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n2";
        var actual = newData[1];
        assertEquals(expected, actual);


    }
    @Test
    public void t6_middleElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8"};
        String[] newData = copyRange(String[]::new, data,0, 7);
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n5";
        var actual = newData[(newData.length+1)/2];
        assertEquals(expected, actual);


    }
    @Test
    public void t7_searchElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8"};
        String[] newData = copyRange(String[]::new, data,0, 7);
        System.out.println(ArrayUtilityHelper.toString(newData));
        String value = "n2";
        boolean found = false;
        for (int i = 0; i < newData.length; i++) {
            if (value.equals(newData[i]))
                found = true;




        }
        var expected = true;
        var actual = found;
        assertEquals(expected, actual);


    }
    @Test
    public void t8_searchElement(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "n7", "n8"};
        String[] newData = copyRange(String[]::new, data,0, 7);
        System.out.println(ArrayUtilityHelper.toString(newData));
        String value = "n34";
        boolean found = false;
        for (int i = 0; i < newData.length; i++) {
            if (value.equals(newData[i]))
                found = true;




        }
        var expected = false;
        var actual = found;
        assertEquals(expected, actual);


    }
    @Test
    public void t9(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "7", "n8"};
        String[] newData = copyRange(String[]::new, data,1, 1);
        System.out.println(ArrayUtilityHelper.toString(newData));
        int expected = 1;
        int actual = newData.length;
        assertEquals(expected, actual);



    }
    @Test
    public void t10(){
        String[] data = {"n1", "n2", "n3", "n4", "n5", "n6", "7", "n8"};
        String[] newData = copyRange(String[]::new, data,0, 6);
        System.out.println(ArrayUtilityHelper.toString(newData));
        int expected = 7;
        int actual = newData.length;
        assertEquals(expected, actual);



    }

}
