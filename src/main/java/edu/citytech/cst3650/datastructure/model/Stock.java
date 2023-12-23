package edu.citytech.cst3650.datastructure.model;

import edu.learning.datastructure.java17.custom.model.KeyAndValue;
import edu.learning.datastructure.java17.facade.IModelEntry;

public class Stock extends KeyAndValue<String, Stock>  implements Comparable<Stock>{
    private String symbol;

    private float yield;

    public Stock(String symbol, float yield) {
        this.symbol = symbol;
        this.setKey(symbol);
        this.yield = yield;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getYield() {
        return yield;
    }

    @Override
    public String getKey() {
        return super.getKey();
    }

    @Override
    public Stock getValue() {
        return this;
    }

    @Override
    public String toString() {
        return                 "symbol='" + symbol + '\'' +
                ", yield=" + yield +
                '}';
    }

    @Override
    public int compareTo(Stock inputStock) {
        int status = this.getKey().compareTo(inputStock.getKey());
        return status;
    }
}
