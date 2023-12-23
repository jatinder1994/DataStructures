package edu.citytech.cst3650.datastructure.dictionary;

import edu.citytech.cst3650.datastructure.model.Stock;
import edu.learning.datastructure.java17.junit._MainTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Custome Dictionary Dealing with Duplicates by: Jatinder Nijjar")
public class T2_DictionaryDuplicates extends _MainTest {
    CustomDictionary<String,Stock> map;

    @BeforeEach
    public void before() {
        map = new CustomDictionary<>(Stock[]::new);
//        map.collisionEvent((index,entry)->{
//            System.out.println("(" + index + ") Collision" + entry);
//        });


        map.put( new Stock("FRO", 0.1368f));
        map.put( new Stock("BCSF", 0.1097f));
        map.put( new Stock("NAT", 0.1262f));
        map.put( new Stock("HSBC", 0.0545f));
        map.put( new Stock("ESEA", 0.075f));
        map.put( new Stock("ISNPY", 0.0676f));
        map.put( new Stock("KB", 0.0543f));
        map.put( new Stock("GLP", 0.0733f));
        map.put( new Stock("BBDC", 0.1122f));
        map.put( new Stock("AAPL", 0.88383f));
        System.out.println("before");

        //Jatinder Nijjar

    }


    @Test
    public void t4() {
        map.put(new Stock("HSBC", .0416f ));
        String expected = "HSBC";
        String actual = map.get(expected).get().getKey();
        assertEquals(expected, actual);
        //Jatinder Nijjar

    }
}
