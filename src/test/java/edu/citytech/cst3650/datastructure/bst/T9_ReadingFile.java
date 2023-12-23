package edu.citytech.cst3650.datastructure.bst;

import com.jbbwebsolution.fileutility.SVUtility;
import edu.citytech.cst3650.datastructure.array.DynamicArray;
import edu.citytech.cst3650.datastructure.bst.avl.AVLTree;
import edu.citytech.cst3650.datastructure.dictionary.CustomDictionary;
import edu.citytech.cst3650.datastructure.model.RealEstateStock;
import edu.citytech.cst3650.datastructure.model.SimpleStock;
import edu.citytech.cst3650.datastructure.model.Stock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import edu.citytech.cst3650.datastructure.bst.BinarySearchTree.*;

import java.net.URL;

public class T9_ReadingFile {

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
        System.out.println(bst.get(900));

    }

}
