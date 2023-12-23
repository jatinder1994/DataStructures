package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Array UtilityHelper Copy Range by Nijjar, Jatinder")
public class T5_ArrayUtilityHelperAllocateMoreData {
    @Test
    @DisplayName("AllocateMore Data")
    public void t1_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        var expected = newSize;
        var actual = newData.length;
        assertEquals(expected, actual);


    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t2_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = null;
        String actual = newData[newData.length-1];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t3_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = "n1";
        String actual = newData[newData.length-newData.length];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t4_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = "n2";
        String actual = newData[newData.length-newData.length+1];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t5_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =10;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = null;
        String actual = newData[newData.length-1];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t6_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = "n7";
        String actual = newData[newData.length-newData.length+6];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t7_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = null;
        String actual = newData[newData.length-newData.length+7];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t8_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = "n2n3";
        String actual = newData[newData.length-newData.length+1]+newData[newData.length-newData.length+2];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t9_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =15;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = "n2n3n4";
        String actual = newData[newData.length-newData.length+1]+newData[newData.length-newData.length+2]+newData[newData.length-newData.length+3];
        assertEquals(expected, actual);




    }
    @Test
    @DisplayName("AllocateMore Data")
    public void t10_AllocateMoreData() {
        String[] data1 = {"n1", "n2", "n3", "n4", "n5"};
        String[] data2 = {"n6", "n7"};
        int newSize =7;
        String[] newData = ArrayUtilityHelper.allocateMoreData(String[]::new, data1, newSize, data2);
        System.out.println(ArrayUtilityHelper.toString(data1));
        System.out.println(ArrayUtilityHelper.toString(data2));
        System.out.println(ArrayUtilityHelper.toString(newData));

        String expected = "n7";
        String actual = newData[newData.length-1];
        assertEquals(expected, actual);




    }

}
