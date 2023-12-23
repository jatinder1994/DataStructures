package edu.citytech.cst3650.datastructure.bst;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Binary Search ")
public class T4_BinarySearchMin {
    final static Integer[] items = {100, 400, 90, 77, 95, 465, 410, 300, 295, 310, 999};

    @DisplayName("BST Min Value")
    @Test
    public void t1(){
        var bst = new BinarySearchTree<Integer>();
        bst.add(items);
        bst.min((i, data)->{
            int expected = 77;
            int actual = data;
            assertEquals(expected,actual);
            System.out.println("i:" +i+ ", data: " + data);
        });
    }
    @DisplayName("BST Min Value")
    @Test
    public void t2(){
        var bst = new BinarySearchTree<Integer>();
        bst.add(items);
        bst.min((count, data)->{
            int expected = 4;
            int actual = count;
            assertEquals(expected,actual);
            System.out.println("i:" +count+ ", data: " + data);
        });
    }
}
