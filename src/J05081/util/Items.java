package J05081.util;


public class Items implements Comparable<Items>{
    private String id, name, unit;
    private long costIn, costOut, profit;

    public Items(int i, String name, String unit, long costIn, long costOut) {
        this.id = "MH"  + String.format("%03d",i);
        this.name = name;
        this.unit = unit;
        this.costIn = costIn;
        this.costOut = costOut;
        this.profit = this.costOut - this.costIn;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + unit + " " + costIn + " " + costOut + " " + profit;
    }
    
    
    
    @Override
    public int compareTo(Items o) {
        if(this.profit < o.profit) return 1;
        else if(this.profit == o.profit) return this.id.compareTo(o.id);
        return -1;
    }
}
