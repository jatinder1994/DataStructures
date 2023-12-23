package edu.citytech.cst3650.datastructure.model;

import com.jbbwebsolution.fileutility.SVColumn;
import edu.learning.datastructure.java17.custom.model.KeyAndValue;

public class RealEstateStock extends KeyAndValue<String, RealEstateStock>  implements Comparable<RealEstateStock>{

    @SVColumn(position = 0) private int rank;
    @SVColumn(position = 1) private String symbol;
    @SVColumn(position = 8) private float marketCapInBillions;
    @SVColumn(position = 9) private float divYield;


    public RealEstateStock() {
    }

    public RealEstateStock(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getMarketCapInBillions() {
        return marketCapInBillions;
    }

    public float getDivYield() {
        return divYield;
    }

//    @Override
//    public String getKey() {
//        return super.getKey();
//    }
//
//    @Override
//    public RealEstateStock getValue() {
//        return this;
//    }

    @Override
    public String toString() {
        return symbol;
    }

    public String MoreDatatoString() {
        return "RealEstateStock{" +
                "rank=" + rank +
                ", symbol='" + symbol + '\'' +
                ", marketCapInBillions=" + marketCapInBillions +
                ", divYield=" + divYield +
                '}';
    }

    @Override
    public String getKey() {
        return this.symbol;
    }

    @Override
    public RealEstateStock getValue() {
        return this;
    }

    @Override
    public int compareTo(RealEstateStock o) {
        return this.symbol.compareTo(o.symbol);
    }
}
