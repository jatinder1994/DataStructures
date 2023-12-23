package edu.citytech.cst3650.datastructure.bst;

import edu.citytech.cst3650.datastructure.bst.avl.AVLTree;
import edu.citytech.cst3650.datastructure.dictionary.CustomDictionary;
import edu.citytech.cst3650.datastructure.model.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("AVL Search Tree by Nijjar, Jatinder")
public class TA01_AVLTree {


    @Test
    public void t1(){
        String m1 = "n1";
        var bst = new AVLTree<String>();
        bst.add(m1);

        var actual = bst.get(m1).get();
        var expected = m1;

        assertEquals(expected,actual);

    }
    @Test
    public void t2_get(){
        var bst = new AVLTree<String>();
        bst.add("n1");
        bst.add("n2");
        bst.add("n0");
        bst.add("n4");
        bst.add("n3");
        bst.add("n6");
        bst.add("n7");
        bst.add("n8");
        bst.add("n9");
        var actual = bst.get("n7").get();
        var expected = "n7";

        assertEquals(expected,actual);
        System.out.println("Nijjar, Jatinder");

    }
    @Test
    public void t3_get(){
        var bst = new AVLTree<String>();
        bst.add("n1");
        bst.add("n2");
        bst.add("n0");
        bst.add("n4");
        bst.add("n3");
        bst.add("n6");
        bst.add("n7");
        bst.add("n8");
        bst.add("n9");
        var actual = bst.get("n1").get();
        var expected = "n1";

        assertEquals(expected,actual);
        System.out.println("Nijjar, Jatinder");

    }
    @Test
    public void t4_get(){
        var bst = new AVLTree<String>();
        bst.add("n1");
        bst.add("n2");
        bst.add("n0");
        bst.add("n4");
        bst.add("n3");
        bst.add("n6");
        bst.add("n7");
        bst.add("n8");
        bst.add("n9");
        var actual = bst.get("n9").get();
        var expected = "n9";

        assertEquals(expected,actual);
        System.out.println("Nijjar, Jatinder");

    }
    @Test
    public void t5_get(){
        var bst = new AVLTree<String>();
        bst.add("John");
        bst.add("Eric");
        bst.add("Henry");
        bst.add("Zack");
        bst.add("Kevin");
        var actual = bst.get("Kevin").get();
        var expected = "Kevin";

        assertEquals(expected,actual);
        System.out.println("Nijjar, Jatinder");

    }
    @Test
    public void tc1_checkHeight(){
        var bst = new AVLTree<String>();
        bst.add("n08");
        bst.add("n09");
        bst.add("n10");

    }
    @Test
    public void tc2_checkHeight(){
        var bst = new AVLTree<Integer>();
        bst.add(47);
        bst.add(87);
        bst.add(67);

    }
    @Test
    public void tc3_checkHeight(){
        var bst = new AVLTree<Integer>();
        bst.add(47);
        bst.add(37);
        bst.add(40);
        System.out.println(bst);

    }
    @Test
    public void tc5_checkHeight(){
        var bst = new AVLTree<Integer>();
        for (int i = 0; i < 20 ; i++) {
            bst.add(i);
        }
        //Developer Jatinder Nijjar
        System.out.println(bst);

    }
    @Test
    public void tc6_checkHeight(){
        var bst = new BinarySearchTree<>();
        for (int i = 0; i < 20 ; i++) {
            bst.add(i);
        }

        System.out.println(bst);
        //developer: Jatinder Nijjar
    }
    @Test
    public void tc7_checkHeight(){
        var bst = new BinarySearchTree<>();
        for (int i = 19; i >=0 ; i--) {
            bst.add(i);
        }

        System.out.println(bst);
        //developer: Jatinder Nijjar
    }

}
