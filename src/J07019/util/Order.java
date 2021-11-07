
package J07019.util;

public class Order {
    private String idOrder;
    private long count, discount, totalPay, total;
    private Product a;

    public Order(int i, String idOrder, long count) {
        this.idOrder = idOrder + "-" + String.format("%03d", i);
        this.count = count;
        a = new Product("", "", 0,0);
        a.setIdProduct(idOrder.substring(0,2));
    }
    
    public void setProduct(Product a){
        this.a = a;
    }
    
    public String getIdProduct(){
        return this.a.getIdProduct();
    }
    public void handle(){
        if(this.idOrder.substring(2,3).equals("1")){
            this.total = a.getCost1()*this.count;
        }
        else this.total = a.getCost2()*this.count;
        if(count >= 150) this.discount = this.total / 2;
        else if(count >= 100) this.discount = this.total*30/100;
        else if(count >= 50) this.discount = this.total * 15 /100;
        else this.discount = 0 ;
        this.totalPay = this.total - this.discount;
    }

    @Override
    public String toString() {
        return  idOrder + " "+a.getName() + " " + discount + " " + totalPay ;
    }
    
}
