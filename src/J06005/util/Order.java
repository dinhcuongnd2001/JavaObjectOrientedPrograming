package J06005.util;
import J06005.util.Client;
import J06005.util.Items;
public class Order {
    private String idOrder, idClient, idItem;
    private long count, totalPay;

    public Order(int i, String idClient, String idItem, long count) {
        this.idOrder = "HD" + String.format("%03d",i);
        this.idClient = idClient;
        this.idItem = idItem;
        this.count = count;
    }
    public void setTotalPay(long outPay){
        this.totalPay = this.count * outPay;
    }
    public long getTotalPay(){
        return this.totalPay;
    }
    public String getIdOrder(){
        return this.idOrder;
    }

    public String getIdClient() {
        return idClient;
    }
    public long getCount(){
        return this.count;
    }

    public String getIdItem() {
        return idItem;
    }
    
}
