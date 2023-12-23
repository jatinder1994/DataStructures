package edu.citytech.cst3650.datastructure.dictionary;

import edu.citytech.cst3650.datastructure.model.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class T0_CompareStocks {
    @Test
    @DisplayName("Not equal to")
    public void t1(){
        var v1 = new Stock("BCSF", 0.1097f);
        var v2 = new Stock("ISNPY", 0.0676f);

        int actual = v1.compareTo(v2);
        int expected = 0;
        System.out.println("actual: " + actual);
        assertNotEquals(expected, actual);
    }
    @Test
    @DisplayName("Equal")
    public void t2(){
        var v1 = new Stock("IBM", 0.1097f);
        var v2 = new Stock("IBM", 0.0676f);

        int actual = v1.compareTo(v2);
        int expected = 0;
        System.out.println("actual: " + actual);
        assertEquals(expected, actual);
    }
}
