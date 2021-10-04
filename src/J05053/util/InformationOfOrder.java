
package J05053.util;

public class InformationOfOrder implements Comparable<InformationOfOrder>{
    String name, code, number;
    long  discount, total, cost, count;

    public InformationOfOrder(String name, String code, long cost, long count) {
        this.name = name;
        this.code = code;
        this.cost = cost;
        this.count = count;
        if(this.code.substring(this.code.length() - 1,this.code.length()).equals("1")){
            this.discount = this.cost * this.count * 50 / 100;
        }
        else this.discount = this.cost * this.count * 30 / 100;
        this.number = this.code.substring(1,4);
        this.total = this.count * this.cost - this.discount;        
    }

    @Override
    public String toString() {
        return name + " " + code + " " + number + " " + discount + " " + total;
    }

    @Override
    public int compareTo(InformationOfOrder o) {
       if(this.number.compareTo(o.number) > 0) return 1;
       return -1;
    }
}
