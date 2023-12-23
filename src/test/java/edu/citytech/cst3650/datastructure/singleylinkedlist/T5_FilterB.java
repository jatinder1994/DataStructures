package edu.citytech.cst3650.datastructure.singleylinkedlist;

import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.learning.datastructure.java17.data.Hero;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

@DisplayName("Filter Dynamic Array By: Nijjar, Jatinder")
public class T5_FilterB extends _MainTest {

    @Test
    @DisplayName("see all heros")
    public void t2(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> true;
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 39;
        assertEquals(expected, actual);
        print.accept(sl);


    }
    @Test
    @DisplayName("filter the Hulk")
    public void t3(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.name().contains("hulk");
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 2;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter power score > 900")
    public void t4(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.powerScore() > 900;
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 10;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter power score > 900 and company")
    public void t5(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.powerScore() > 900;
        predicate  = predicate.and(e -> e.company().equals("marvel"));
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 7;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter DC heros")
    public void t6(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.company().equals("dc");
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 17;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter by powerscore lower than 250")
    public void t7(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.powerScore() < 250;
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 3;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter batman and company")
    public void t8(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.company().equals("dc");
        predicate = predicate.and(e-> e.name().contains("batman"));
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 1;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter by name super")
    public void t9(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.name().contains("super");
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 2;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter by name super and powerscore")
    public void t10(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.name().contains("super");
        predicate = predicate.and(e-> e.powerScore()> 948);
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 1;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
    @Test
    @DisplayName("filter by name containing wolve")
    public void t11(){
        var sl = new DynamicArray<>(Hero[]::new);
        var sl2 = new DynamicArray<>(Hero[]::new);
        sl.add(heroes);
        Predicate<Hero> predicate = e -> e.name().contains("wolve");
        sl.filter(predicate,sl2::add);
        var actual = sl2.size();
        var expected = 1;
        assertEquals(expected, actual);
        print.accept(sl2);


    }
}

