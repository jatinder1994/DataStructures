package edu.citytech.cst3650.datastructure.csv;

import com.jbbwebsolution.fileutility.SVUtility;
import edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper;
import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.citytech.cst3650.datastructure.model.SimpleStock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class T1_ReadingFile {
    @Test
    @DisplayName("SVUtility by: Nijjar, Jatinder")
    public void t1_size(){
        var svUtility = new SVUtility<SimpleStock>();
        String filename = "./data/cst3650.stock.quant.csv";
        URL resource = SVUtility.class.getClassLoader().getResource(filename);
        svUtility.process(System.out::println, resource,SimpleStock.class,2,",");
    }
    @Test
    @DisplayName("DynamicArray by: Nijjar, Jatinder")
    public void t2_size(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);
        da.add("A");
        da.add("B");
        da.add("C");
        da.add("D");
        da.add("E");
        da.add("F");
        da.add("G");
        da.add("H");
        da.add("I");
        da.add("J");
        da.add("K");
        da.add("L");
        da.add("M");
        da.add("N","O","P","Q");
        int acutal = da.size();
        int expected = 17;
        assertEquals(expected,acutal);

    }
    @Test
    @DisplayName("DynamicArray by: Nijjar, Jatinder")
    public void t3_get(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);
        da.add("A");
        da.add("B");
        da.add("C");
        da.add("D");
        da.add("E");
        da.add("F");
        da.add("G");
        da.add("H");
        da.add("I");
        da.add("J");
        da.add("K");
        da.add("L");
        da.add("M");
        da.add("N","O","P","Q");
        var acutal = da.get(16).get() + da.get(0).get();
        var expected = "Q" + "A";
        assertEquals(expected,acutal);
        System.out.println(da);

    }
    @Test
    @DisplayName("DynamicArray by: Nijjar, Jatinder")
    public void t4_get(){
        DynamicArray<String> da = new DynamicArray<>(String[]::new, 10);
        da.add("A");
        da.add("B");
        var acutal = da.get(16);
        var expected = Optional.empty();
        assertEquals(expected,acutal);

    }
    @Test
    @DisplayName("SVUtility and DAO size by: Nijjar, Jatinder")
    public void t4_size(){
        var svUtility = new SVUtility<SimpleStock>();
        String filename = "./data/cst3650.stock.quant.csv";
        URL resource = SVUtility.class.getClassLoader().getResource(filename);
        DynamicArray<SimpleStock> da = new DynamicArray<>(SimpleStock[]::new, 10);
        svUtility.process(da::add, resource,SimpleStock.class,2,",");
        var acutal = da.size();
        var expected = 4500;
        var condition = acutal > expected;
        assertTrue(condition);
    }
    @Test
    @DisplayName("SVUtility and DAO size by: Nijjar, Jatinder")
    public void t5_size(){
        var svUtility = new SVUtility<SimpleStock>();
        String filename = "./data/cst3650.stock.quant.csv";
        URL resource = SVUtility.class.getClassLoader().getResource(filename);
        DynamicArray<SimpleStock> da = new DynamicArray<>(SimpleStock[]::new, 0);
        svUtility.process(da::add, resource,SimpleStock.class,2,",");
        var acutal = da.size();
        var expected = 4500;
        var condition = acutal > expected;
        assertTrue(condition);
    }
    @Test
    @DisplayName("SVUtility and DAO size by: Nijjar, Jatinder")
    public void t6_size(){
        var svUtility = new SVUtility<SimpleStock>();
        String filename = "./data/cst3650.stock.quant.csv";
        URL resource = SVUtility.class.getClassLoader().getResource(filename);
        DynamicArray<SimpleStock> da = new DynamicArray<>(SimpleStock[]::new, 0);
        svUtility.process(da::add, resource,SimpleStock.class,2,",");
        var acutal = da.size();
        var expected = 4500;
        var condition = acutal > expected;
        assertTrue(condition);
        da.removeAll();
        svUtility.process(da::add, resource,SimpleStock.class,2,",");
        System.out.println(da);
    }
}
