
package J07019.util;

public class Product {
    private String idProduct, nameProduct;
    private long cost1, cost2;

    public Product(String idProduct, String nameProduct, long cost1, long cost2) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.cost1 = cost1;
        this.cost2 = cost2;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public long getCost1() {
        return cost1;
    }

    public long getCost2() {
        return cost2;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
    
    public String getName() {
        return this.nameProduct;
    }
}
