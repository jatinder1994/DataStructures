package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@DisplayName("Remove First by Nijjar, Jatinder")
public class T2_RemoveFirst extends _MainTest {
    @Test
    @DisplayName("Remove first plus check size")
    public void t1(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeFirst();
        var actual = sl.size();
        var expected = 4;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove first")
    public void t1B(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeFirst();
        Optional<String> actual = sl.getFirstItem();
        var expected = "B";
        assertEquals(actual.get(), expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove first with zero records")
    public void t2(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A");
        sl.removeFirst();
        Optional<String> actual = sl.getFirstItem();
        var expected = Optional.empty();
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test //Jatinder Nijjar
    @DisplayName("Remove all Test")
    public void t3(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        int size = sl.size();
        for (int i = 0; i < size; i++) {
            sl.removeFirst();
            
        }
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }

    public void deleteToMuch(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A","B", "C", "D","E");
        int size = sl.size() + 1;
        for (int i = 0; i < size; i++) {
            sl.removeFirst();
        }

        print.accept(sl);


    }

    @Test
    @DisplayName("Remove all Test with Exception")
    public void t5Exception(){
        assertThrows(NoSuchElementException.class,
                ()->{deleteToMuch();});
    }
    @Test
    @DisplayName("Remove first with zero records")
    public void t6(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("Henry");
        sl.removeFirst();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove first")
    public void t7(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("Henry", "Davis", "James", "Kevin", "Blake");
        sl.removeFirst();
        Optional<String> actual = sl.getFirstItem();
        var expected = "Davis";
        assertEquals(actual.get(), expected);
        print.accept(sl.toString());


    }
    @Test //Jatinder Nijjar
    @DisplayName("Remove all Test")
    public void t8(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("Henry", "Davis", "James", "Kevin", "Blake");
        int size = sl.size();
        for (int i = 0; i < size; i++) {
            sl.removeFirst();

        }
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove first with zero records")
    public void t9(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("L", String.valueOf(1));
        sl.removeFirst();
        var actual = sl.size();
        var expected = 1;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove first with zero records")
    public void t10(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("L", String.valueOf(1));
        sl.removeFirst();
        Optional<String> actual = sl.getFirstItem();
        var expected = "1";
        assertEquals(actual.get(), expected);
        print.accept(sl.toString());


    }

}
