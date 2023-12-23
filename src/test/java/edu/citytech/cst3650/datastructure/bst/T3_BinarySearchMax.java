package edu.citytech.cst3650.datastructure.bst;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Binary Search ")
public class T3_BinarySearchMax {
    final static Integer[] items = {100, 400, 90, 77, 95, 465, 410, 300, 295, 310, 999};

    @DisplayName("BST Max Value")
    @Test
    public void t1(){
        var bst = new BinarySearchTree<Integer>();
        bst.add(items);
        bst.max((i, data)->{
            int expected = 999;
            int actual = data;
            assertEquals(expected,actual);
            System.out.println("i:" +i+ ", data: " + data);
        });
        System.out.println(bst);
        System.out.println("Nijjar, Jatinder");
    }
    @DisplayName("BST Max Value")
    @Test
    public void t2(){
        var bst = new BinarySearchTree<Integer>();
        bst.add(items);
        bst.max((count, data)->{
            int expected = 4;
            int actual = count;
            assertEquals(expected,actual);
            System.out.println("i:" +count+ ", data: " + data);
        });
    }
}
