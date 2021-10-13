
package J05012.util;

public class Order implements Comparable<Order>{
    private String id, name;
    private long count, cost, tip, totalPay;

    public Order(String id, String name, long count, long cost, long tip) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.cost = cost;
        this.tip = tip;
        this.totalPay = this.count * this.cost - this.tip;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + count + " " + cost + " " + tip + " " + totalPay ;
    }

    @Override
    public int compareTo(Order o) {
        if(this.totalPay < o.totalPay) return 1;
        return -1;
    }


}
