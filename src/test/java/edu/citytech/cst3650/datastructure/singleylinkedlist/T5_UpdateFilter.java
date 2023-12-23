package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.learning.datastructure.java17.data.Hero;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

@DisplayName("Update One By: Nijjar, Jatinder")
public class T5_UpdateFilter extends _MainTest {

    @Test
    @DisplayName("update")
    public void t1(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("a", "b", "c", "d", "e");
        int status = sl.updateOne(e-> e.equals("b"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 5;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t2(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("a", "b", "c", "d", "e");
        int status = sl.updateOne(e-> e.equals("z"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 6;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t3(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("a", "b", "c", "d", "e");
        int status = sl.updateOne(e-> e.equals("c"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 5;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t4(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("a", "b", "c", "d", "e");
        int status = sl.updateOne(e-> e.equals("d"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 5;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t5(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("a", "b", "c", "d", "e");
        int status = sl.updateOne(e-> e.equals("e"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 5;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t6(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("a", "b", "c", "d", "e");
        int status = sl.updateOne(e-> e.equals("s"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 6;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t7(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("aaa", "bbb", "ccc", "ddd", "eee");
        int status = sl.updateOne(e-> e.equals("aaa"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 5;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t8(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("a");
        int status = sl.updateOne(e-> e.equals("a"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 1;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t9(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("S");
        int status = sl.updateOne(e-> e.equals("c"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 2;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }
    @Test
    @DisplayName("update")
    public void t10(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("S", "c");
        int status = sl.updateOne(e-> e.equals("c"), "a1", System.out::println);

        var actual = sl.size();
        var expected = 2;
        assertEquals(expected, actual);
        print.accept(sl);
        print.accept("status " + status);


    }

}

