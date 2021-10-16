
package J05076.util;
public class Products {
    private String id, name, type;
    private long profit ,totalIn, cost, totalOut, countIn, countOut;

    public Products(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        if(this.type.equals("A")) this.profit = 8;
        else if(this.type.equals("B")) this.profit = 5;
        else this.profit = 2;
    }
    

    public void setOders(long countIn , long cost, long counOut) {
        this.countIn = countIn;
        this.cost = cost;
        this.countOut = counOut;
        this.totalIn = this.cost * this.countIn;
        this.totalOut = this.cost * this.countOut * (100 + this.profit) / 100;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + totalIn + " " + totalOut ;
    }
    
    
}
