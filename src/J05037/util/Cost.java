
package J05037.util;

public class Cost implements Comparable<Cost>{
    private String id, name, unit;
    private long imPrice, count, transferCost, total, exPrice;

    public Cost(int i, String name, String unit, long imPrice, long count) {
        this.id = "MH" + String.format("%02d", i);
        this.name = name;
        this.unit = unit;
        this.imPrice = imPrice;
        this.count = count;
        long imTotal = this.imPrice * this.count;
        this.transferCost = Math.round((double)imTotal * 5 / 100);
        this.total = Math.round(this.transferCost + (double)imTotal);
        double val1 = (this.total * 1.0 * 102.0 / 100.0) / (double)(this.count);
        this.exPrice = (long)Math.ceil(val1 / 100) * 100;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + unit + " " + transferCost + " " + total + " " + exPrice;
    }

    @Override
    public int compareTo(Cost o) {
       if(this.exPrice < o.exPrice) return 1;
       return -1;
    }
    
}