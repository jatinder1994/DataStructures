package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Array UtilityHelper by Nijjar, Jatinder")
public class T1_AddData extends _MainTest {
    @Test
    public void t1(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        var actual = sl.size();
        var expected = 5;
        assertEquals(actual, expected);


    }
    @Test
    public void t2(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A");
        var actual = sl.getLastItem().get();
        var expected = sl.getFirstItem().get();
        assertEquals(actual, expected);


    }
    @Test //Jatinder Nijjar
    public void t3(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        var actual = sl.getLastItem().get();
        var expected = "E";
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
}
