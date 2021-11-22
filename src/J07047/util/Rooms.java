
package J07047.util;

public class Rooms {
    private String id, name;
    private double cost, servicePay; 

    public Rooms(String x) {
        String s[]= x.split(" " , 4);
        this.id = s[0];
        this.name = s[1];
        this.cost = Double.parseDouble(s[2]);
        this.servicePay = Double.parseDouble(s[3]);
    }

    public double getCost() {
        return cost;
    }

    public double getServicePay() {
        return servicePay;
    }

    public String getId() {
        return id;
    }
    
}
