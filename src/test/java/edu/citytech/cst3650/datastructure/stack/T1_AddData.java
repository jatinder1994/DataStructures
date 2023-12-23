package edu.citytech.cst3650.datastructure.stack;

import edu.learning.datastructure.java17.facade.IStack;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Stack")
public class T1_AddData extends _MainTest {
    @DisplayName("Add to Stack")
    @Test
    public void t1(){
        IStack<String> sl = new Stack<>(String[]::new);
        sl.push("A", "B", "C", "D", "E");
        var actual = sl.size();
        var expected = 5;

        assertEquals(expected, actual);
    }
    @DisplayName("Push to Stack")
    @Test
    public void t2(){
        IStack<String> sl = new Stack<>(String[]::new);
        sl.push("A", "B", "C", "D", "E");
        sl.push("F");
        var actual = sl.size();
        var expected = 6;

        assertEquals(expected, actual);
    }
    @DisplayName("Remove 1 item from the Stack")
    @Test
    public void t3(){
        IStack<String> sl = new Stack<>(String[]::new);
        sl.push("A", "B", "C", "D", "E");
        sl.pop();
        var actual = sl.size();
        var expected = 4;

        assertEquals(expected, actual);
    }
    @DisplayName("peek first from Stack")
    @Test
    public void t4(){
        IStack<String> sl = new Stack<>(String[]::new);
        sl.push("A", "B", "C", "D", "E");
        var actual = sl.peekFirst();
        var expected = "A";

        assertEquals(expected, actual);
    }
    @DisplayName("peek last from Stack")
    @Test
    public void t5(){
        IStack<String> sl = new Stack<>(String[]::new);
        sl.push("A", "B", "C", "D", "E");
        var actual = sl.peekLast();
        var expected = "E";

        assertEquals(expected, actual);
    }
}
