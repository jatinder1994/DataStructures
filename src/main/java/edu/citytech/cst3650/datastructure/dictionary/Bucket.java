package edu.citytech.cst3650.datastructure.dictionary;

import edu.citytech.cst3650.datastructure.bst.BSTNode;
import edu.citytech.cst3650.datastructure.bst.avl.AVLTree;
import edu.citytech.cst3650.datastructure.singleylinkedlist.SingleyLinkedList;
import edu.learning.datastructure.java17.custom.model.CompareT;
import edu.learning.datastructure.java17.facade.AbstractDataType;
import edu.learning.datastructure.java17.facade.IDictionary;
import edu.learning.datastructure.java17.facade.IModelEntry;

public class Bucket <K,V>  {
    private int size = 0;
//    private AbstractDataType<IModelEntry<K,V>> entries = new SingleyLinkedList<>();
    private AbstractDataType<IModelEntry<K,V>> entries = new AVLTree<>();



    public void addEntries(IModelEntry<K,V> modelEntry){
//        //entries.add(modelEntry);
//        entries.add(modelEntry);
        entries.updateOne(e -> CompareT.isEqualTo(e,modelEntry), modelEntry, e-> {});


    }
    public AbstractDataType<IModelEntry<K,V>> getEntries(){
        return entries;
    }

    public void removeEntry(IModelEntry<K,V> entry){
        this.entries.remove(entry);
    }
    @Override
    public String toString(){
        return  "Bucket [entries=" + entries + "]";
    }


}
