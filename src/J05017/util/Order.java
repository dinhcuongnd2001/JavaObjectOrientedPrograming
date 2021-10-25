
package J05017.util;

import java.math.*;

public class Order implements Comparable<Order>{
    private String id, name;
    private long inIndex, outIndex, totalIndex, extra, total, totalPay, cost;

    public Order(int i, String name, long inIndex, long outIndex) {
        this.id = "KH" + String.format("%02d", i);
        this.name = name;
        this.inIndex = inIndex;
        this.outIndex = outIndex;
        this.totalIndex = this.outIndex - this.inIndex;
        if(this.totalIndex <= 50){
            this.extra = 2 ;
            this.total = this.totalIndex * 100;
        }
        else if(this.totalIndex <= 100){
            this.extra = 3;         
            this.total = 50 * 100 + (this.totalIndex - 50) * 150;
        }
        else {
            this.extra = 5;
            this.total = 50 * 250 + (this.totalIndex - 100) * 200;
        }
        this.totalPay =(long)Math.round(this.total*1.0*(100+ this.extra) / 100);
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + totalPay;
    }
   
    @Override
    public int compareTo(Order o) {
        if(this.totalPay < o.totalPay) return 1;
        return -1;
    }
    
}
