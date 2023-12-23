package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.citytech.cst3650.datastructure.stack.Stack;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;

@DisplayName("Max By: Nijjar, Jatinder")
public class T6_Max extends _MainTest {

    @Test
    @DisplayName("get max")
    public void t1(){
        var sl = new SingleyLinkedList<>(Integer[]::new);
        sl.add(100, 1_000, 200,500,400);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 1000;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t2(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(100, 1_000, 200,500,400);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 1000;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t3(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(1,2,3,4,5);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 5;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t4(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(5,4,3,2,1);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 5;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t5(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(1,4,6,7,90,6,4,3,6);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 90;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t7(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(1_000,1_000_000,100,1);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 1_000_000;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t8(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(90);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 90;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t9(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(1,1,1,1,1,1);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 1;
        assertEquals(expected, actual);



    }
    @Test
    @DisplayName("get max push")
    public void t10(){
        var sl = new Stack<>(Integer[]::new);
        sl.push(1,100);

        AtomicInteger ai = new AtomicInteger();
        sl.max((index,data)->{
            ai.set(data);
        });

        var actual = ai.get();
        var expected = 100;
        assertEquals(expected, actual);



    }


}

