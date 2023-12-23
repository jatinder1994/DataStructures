package edu.citytech.cst3650.datastructure.bst;

import edu.citytech.cst3650.datastructure.array.ArrayUtilityHelper;
import edu.citytech.cst3650.datastructure.dictionary.CustomDictionary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Binary Search Tree Add by Nijjar, Jatinder")
public class T1_BinarySearchTree {
    @Test
    public void t1_size(){
        String m1 = "n1";
        var bst = new BinarySearchTree<String>();
        bst.add(m1);
        int actual = bst.size();
        int expected = 1;

        assertEquals(expected,actual);

    }
    @Test
    public void t2_size(){

        var bst = new BinarySearchTree<String>();
        bst.add("n1");
        bst.add("n2");
        bst.add("n0");
        bst.add("n4");
        bst.add("n3");
        bst.add("n6");
        bst.add("n5");
        bst.add("n8");
        bst.add("n9");
        int actual = bst.size();
        int expected = 9;

        assertEquals(expected,actual);
        System.out.println(bst);

    }

}
