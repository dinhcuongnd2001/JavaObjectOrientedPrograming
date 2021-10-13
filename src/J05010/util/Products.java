
package J05010.util;

import java.math.*;

public class Products implements Comparable<Products>{
    private String id, name, group;
    private double inPay, outPay , profit;

    public Products(int i, String name, String group, double inPay, double outPay) {
        this.id = String.valueOf(i);
        this.name = name;
        this.group = group;
        this.inPay = inPay;
        this.outPay = outPay;
        this.profit = Math.round((this.outPay - this.inPay) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + group + " " + String.format("%.2f", profit);
    }

    @Override
    public int compareTo(Products o) {
        if(this.profit < o.profit) return 1 ;
        return -1;
    }
    
}
