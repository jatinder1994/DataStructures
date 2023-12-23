package edu.citytech.cst3650.datastructure.dictionary;

import edu.learning.datastructure.java17.custom.model.KeyAndValue;
import edu.learning.datastructure.java17.facade.IDictionary;
import edu.learning.datastructure.java17.facade.IModelEntry;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;

public class CustomDictionary <K,V> implements IDictionary<K,V> {

    private IModelEntry<K,V>[] hashtable;
    private Bucket<K,V>[] hashTable;
    private int size;
    private int collisonCount;
    private BiConsumer<Integer, IModelEntry<K,V>> biConsumer;

    public CustomDictionary(IntFunction<IModelEntry<K,V>[]> intFunction){
        hashtable = intFunction.apply(10);
        this.hashTable = new Bucket[10];

    }
    public CustomDictionary(IntFunction<IModelEntry<K,V>[]> intFunction, int size){
        hashtable = intFunction.apply(size);
        this.hashTable = new Bucket[size];

    }

    public int getIndexPosition(K key){
        int hashcode = key.hashCode();
        int indexPosition = hashcode % hashtable.length;
        return indexPosition;
    }

    private int iterationCount;

    @Override
    public int iterationCount() {
        return this.iterationCount;
    }

    @Override
    public void put(IModelEntry<K, V> entry) {

        int indexPosition = getIndexPosition(entry.getKey());
        if(this.hashTable[indexPosition] ==null){
            hashTable[indexPosition] = new Bucket<>();

        }this.hashTable[indexPosition].addEntries(entry);

        if(this.hashtable[indexPosition] !=null){
          this.collisonCount++;
          if(biConsumer !=null)
            biConsumer.accept(indexPosition, entry);
        }else{
            this.hashtable[indexPosition] = entry;
        }
        this.size++;

    }

    @Override
    public void collisionEvent(BiConsumer<Integer, IModelEntry<K, V>> biConsumer) {
        this.biConsumer = biConsumer;
    }

    @Override
    public void put(IModelEntry<K, V>... values) {
        IDictionary.super.put(values);
    }

    @Override
    public Optional<V> get(K key) {
        int indexPosition = getIndexPosition(key);
        Bucket<K,V> bucket = this.hashTable[indexPosition];
        IModelEntry<K,V> keyLookUp = new KeyAndValue<>(key);
        var modelEntry = bucket.getEntries().findFirst(keyLookUp);
        this.iterationCount = bucket.getEntries().iterationCount() +1;
        if(modelEntry .isEmpty()){
            return Optional.empty();
        }else{
            return Optional.of(modelEntry.get().getValue());
        }



    }

    @Override
    public void delete(K key) {
        IDictionary.super.delete(key);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int getMaxBucketSize() {
        int max = 0;

        for (Bucket<K, V> bucket : hashTable) {
            if (bucket != null) {
                int bucketSize = bucket.getEntries().size();
                if (bucketSize > max) {
                    max = bucketSize;
                }
            }
        }

        return max;
    }
}
