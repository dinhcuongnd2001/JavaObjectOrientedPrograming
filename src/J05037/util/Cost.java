
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
        this.total = this.transferCost + imTotal;
        this.exPrice = Math.round((Math.round((double)this.total * 102 / 100) / this.count)/10) * 10;
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