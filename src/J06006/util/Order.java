
package J06006.util;

public class Order implements Comparable<Order>{
    private String idOrder, idClient, idItem, nameClient, addressClient,nameItem;
    private long count, totalPay, profit;

    public Order(int i, String idClient, String idItem, long count) {
        this.idOrder = "HD" + String.format("%03d",i);
        this.idClient = idClient;
        this.idItem = idItem;
        this.count = count;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public void setAddressClient(String addressClient) {
        this.addressClient = addressClient;
    }
    
    
    
    public void setTotalPay(long outPay){
        this.totalPay = this.count * outPay;
    }
    
    public void setProfit(long inPay , long outPay){
        this.profit = (outPay - inPay) * this.count;
    }
    public long getProfit(){
        return this.profit;
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

    @Override
    public String toString() {
        return  idOrder + " " + nameClient + " " + addressClient + " " + nameItem + " " +count + " " + totalPay + " " + profit ;
    }
    
    @Override
    public int compareTo(Order o) {
        if(this.profit < o.profit) return 1;
        else if(this.profit == o.profit) return this.idOrder.compareTo(o.idOrder);
        return -1;
    }
}