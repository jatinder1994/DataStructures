package edu.citytech.cst3650.datastructure.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper.copyRange;
import static org.junit.Assert.assertEquals;

@DisplayName("Array UtilityHelper Copy Range by Nijjar, Jatinder")
public class T4_ArrayUtilityHelperRemove {
    @Test
    public void t1_removeIndex(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeByIndex(String[]::new, data,0);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n2";
        var actual = newData[0];
        assertEquals(expected, actual);


    }
    @Test
    public void t2_removeIndex(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeByIndex(String[]::new, data,4);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));
        var expected = "n4";
        var actual = newData[newData.length-1];
        assertEquals(expected, actual);


    }
    @Test
    public void t3_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        System.out.println(ArrayUtilityHelper.toString(data));
        data = ArrayUtilityHelper.removeByIndexes(String[]::new, data,1,2,3);
        System.out.println(ArrayUtilityHelper.toString(data));
//        var expected = "n4";
//        var actual = newData[newData.length-2];
//        assertEquals(expected, actual);


    }
    @Test
    public void t4_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeIndexesProfessorWay(String[]::new, data,0,1,4);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

    }
    @Test
    public void t5_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeIndexesProfessorWay(String[]::new, data,0,1,4);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

    }
    @Test
    public void t6_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeIndexesProfessorWay(String[]::new, data,0);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

    }
    @Test
    public void t7_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeIndexesProfessorWay(String[]::new, data,2);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

    }
    @Test
    public void t8_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeIndexesProfessorWay(String[]::new, data,0,1,2,3,4);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

    }
    @Test
    public void t9_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeIndexesProfessorWay(String[]::new, data,4);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

    }
    @Test
    public void t10_removeIndexes(){
        String[] data = {"n1", "n2", "n3", "n4", "n5"};
        String[] newData = ArrayUtilityHelper.removeIndexesProfessorWay(String[]::new, data,3);
        System.out.println(ArrayUtilityHelper.toString(data));
        System.out.println(ArrayUtilityHelper.toString(newData));

    }


}
