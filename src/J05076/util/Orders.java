
package J05076.util;

public class Orders {
    private String idProduct;
    private long countIn, cost, countOut;

    public Orders(String s) {
        String a[] = s.split(" ");
        this.idProduct = a[0];
        this.countIn = Long.parseLong(a[1]);
        this.cost = Long.parseLong(a[2]);
        this.countOut = Long.parseLong(a[3]);
    }

    public String getIdProduct() {
        return idProduct;
    }

    public long getCountIn() {
        return countIn;
    }

    public long getCost() {
        return cost;
    }

    public long getCountOut() {
        return countOut;
    }
    
    
}
