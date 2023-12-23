package edu.citytech.cst3650.datastructure.bst;

import com.jbbwebsolution.fileutility.SVUtility;
import edu.citytech.cst3650.datastructure.bst.avl.AVLTree;
import edu.citytech.cst3650.datastructure.dictionary.CustomDictionary;
import edu.citytech.cst3650.datastructure.model.RealEstateStock;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class TC01_DictionaryWithBST {
    @Test
    @DisplayName("Load BST with Dictionary/SinglyLinkedList by: Nijjar, Jatinder")
    public void t1_size(){

        CustomDictionary<String, RealEstateStock> customDictionary
                = new CustomDictionary(RealEstateStock[]::new,24);

        var svUtility = new SVUtility<RealEstateStock>();
        String filename = "./data/SortedTopRealEstate.csv";
        URL resource = SVUtility.class.getClassLoader().getResource(filename);
        svUtility.process(customDictionary::put, resource, RealEstateStock.class,2,",");
        //Developer Jatinder Nijjar
        var result = customDictionary.get("SOHO").get();
        System.out.println("iteration Count: " + customDictionary.iterationCount());
        System.out.println("Result: " + result.MoreDatatoString());
        System.out.println("customerdictionarySize: " + customDictionary.size());
        System.out.println("Max bucket size: " + customDictionary.getMaxBucketSize());

    }
}
