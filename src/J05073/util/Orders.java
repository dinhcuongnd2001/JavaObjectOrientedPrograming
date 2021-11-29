
package J05073.util;
public class Orders {
    private String id;
    private double cost, count, costPay, total;
    private double tax,transporttax , bonus;

    public Orders(String id, double cost, double count) {
        this.id = id;
        this.cost = cost;
        this.count = count;
        String fisrt = id.substring(0,1), last = id.substring(this.id.length()-1, this.id.length());
        if(fisrt.equals("T")){
            this.tax = 29;
            this.transporttax = 4;
        }
        else if(fisrt.equals("C")){
            this.tax = 10;
            this.transporttax = 3;
        }
        else if(fisrt.equals("D")){
            this.tax = 8;
            this.transporttax = 2.5;
        }
        else if(fisrt.equals("M")){
            this.tax = 2;
            this.transporttax = 0.5;
        }
        if(last.equals("C")) this.bonus = 5;
        else if(last.equals("K")) this.bonus =0 ;
    }
    
}
