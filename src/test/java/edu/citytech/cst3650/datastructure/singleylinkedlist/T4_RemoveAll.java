package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@DisplayName("Remove All")
public class T4_RemoveAll extends _MainTest {
    @Test
    @DisplayName("Remove all by: Jatinder Nijjar ")
    public void t1(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all")
    public void t2(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all")
    public void t3(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("Aaaa", "bBBB", "cCCC");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all")
    public void t4(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("Aaaa");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all")
    public void t5(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("1", "2","3", "4");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all")
    public void t6(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("1", "1","1", "1");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all")
    public void t7(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add(String.valueOf(1));
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all")
    public void t8(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add(String.valueOf(1),String.valueOf(2),String.valueOf(3));
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all check size")
    public void t9(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("llalal", "kkkjkjd", "djjjdjj");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove all check size")
    public void t10(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("New York City", "", "");
        sl.removeAll();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
}
