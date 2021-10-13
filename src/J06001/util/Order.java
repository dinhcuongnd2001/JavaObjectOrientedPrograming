
package J06001.util;

public class Order {
    private String id, nameProduct;
    private long count, total, discount, totalPay;
    private static int num = 1;

    public Order(String id, long count) {
        this.id = id + "-" + String.format("%03d", num);
        this.count = count;
        num += 1;
    }

    public String getId() {
        return id;
    }
    
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setTotalAndTotalPay(long cost) {
        this.total = cost*this.count;
        if(count >= 150) this.discount = this.total/2 ;
        else if(count >= 100) this.discount = this.total * 30/100;
        else if(count >= 50) this.discount = this.total * 15/100;
        else this.discount = 0;
        this.totalPay = this.total - this.discount;
    }
    
    @Override
    public String toString() {
        return id + " " + nameProduct + " " + discount + " " + totalPay;
    }
}
