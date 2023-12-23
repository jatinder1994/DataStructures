package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.learning.datastructure.java17.facade.AbstractNode;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@DisplayName("Remove Last by Jatinder Nijjar")
public class T3_RemoveLast extends _MainTest {
    @Test
    @DisplayName("Remove last plus check size")
    public void t1(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeLast();
        var actual = sl.size();
        var expected = 4;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove last")
    public void t1B(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A", "B", "C", "D", "E");
        sl.removeLast();
        Optional<String> actual = sl.getLastItem();
        var expected = "D";
        assertEquals(actual.get(), expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove last with zero records")
    public void t2(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("A");
        sl.removeLast();
        var actual = sl.size();
        var expected = 0;
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
            sl.removeLast();

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
            sl.removeLast();
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
    @DisplayName("Remove last with zero records")
    public void t6(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("Henry");
        sl.removeLast();
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove last")
    public void t7(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("Henry", "Davis", "James", "Kevin", "Blake");
        sl.removeLast();
        Optional<String> actual = sl.getLastItem();
        var expected = "Kevin";
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
            sl.removeLast();

        }
        var actual = sl.size();
        var expected = 0;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove last with zero records")
    public void t9(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("L", String.valueOf(1));
        sl.removeLast();
        var actual = sl.size();
        var expected = 1;
        assertEquals(actual, expected);
        print.accept(sl.toString());


    }
    @Test
    @DisplayName("Remove last with zero records")
    public void t10(){
        var sl = new SingleyLinkedList<>(String[]::new);
        sl.add("1", "a");
        sl.removeLast();
        Optional<String> actual = sl.getLastItem();
        var expected = "1";
        assertEquals(actual.get(), expected);
        print.accept(sl.toString());


    }


}
