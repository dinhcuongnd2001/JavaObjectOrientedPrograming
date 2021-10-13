
package J05068.util;

public class Order implements Comparable<Order>{
    private String id, manufacturer;
    private long count, cost , tax ,taxPay, total , realPay;


    public Order(String id, long count) {
        this.id = id;
        this.count = count;
        if(this.id.substring(3,5).equals("BP")) this.manufacturer = "British Petro";
        else if(this.id.substring(3,5).equals("ES")) this.manufacturer = "Esso";
        else if(this.id.substring(3,5).equals("SH")) this.manufacturer = "Shell";
        else if(this.id.substring(3,5).equals("CA")) this.manufacturer = "Castrol";
        else if(this.id.substring(3,5).equals("MO")) this.manufacturer = "Mobil";
        else this.manufacturer = "Trong Nuoc";
        
        if(this.id.substring(3,5).equals("TN")){
            this.tax = 0;
            if(this.id.substring(0,1).equals("X")){
                this.cost= 128000;
            }
            else if(this.id.substring(0,1).equals("D")){
                this.cost= 11200;
            }
            else this.cost = 9700;
        }
        else{
            if(this.id.substring(0,1).equals("X")){
                this.cost= 128000;
                this.tax = 30;
            }
            else if(this.id.substring(0,1).equals("D")){
                this.cost= 11200;
                this.tax = 35;
            }
            else{
                this.cost = 9700;
                this.tax = 20;
            }
        }
        this.total = this.count * this.cost;
        this.taxPay = this.total * this.tax / 1000;
        this.realPay = this.total + this.taxPay;
    }

    @Override
    public String toString() {
        return id + " " + manufacturer + " " + cost + " " + taxPay + " " + realPay;
    }

    @Override
    public int compareTo(Order o) {
        if(this.realPay < o.realPay) return 1;
        return -1;
    }
    
}
