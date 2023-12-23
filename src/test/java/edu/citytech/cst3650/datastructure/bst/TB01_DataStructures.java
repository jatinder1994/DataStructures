package edu.citytech.cst3650.datastructure.bst;

import com.jbbwebsolution.fileutility.SVUtility;
import edu.citytech.cst3650.datastructure.bst.avl.AVLTree;
import edu.citytech.cst3650.datastructure.dictionary.CustomDictionary;
import edu.citytech.cst3650.datastructure.model.RealEstateStock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class TB01_DataStructures {
    @Test
    @DisplayName("SVUtility by: Nijjar, Jatinder")
    public void t1_size(){

        BinarySearchTree<RealEstateStock> bst = new AVLTree<>();
        var svUtility = new SVUtility<RealEstateStock>();
        String filename = "./data/SortedTopRealEstate.csv";
        URL resource = SVUtility.class.getClassLoader().getResource(filename);
        svUtility.process(bst::add, resource, RealEstateStock.class,2,",");
        //Developer Jatinder Nijjar
        System.out.println(bst);

        bst.max((index,data) -> {
            System.out.println(index + " " + data);
        });
        bst.min((index,data) -> {
            System.out.println(index + " " + data);
        });
        bst.get(new RealEstateStock("SOHO"));
        System.out.println("iteration Count: " + bst.iterationCount());

    }
}
