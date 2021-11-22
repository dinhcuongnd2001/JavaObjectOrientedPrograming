package J07049.util;

public class Products {
    private String idProduct, name;
    private int cost, date;

    public Products(String idProduct, String name, int cost, int date) {
        this.idProduct = idProduct;
        this.name = name;
        this.cost = cost;
        this.date = date;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public int getCost() {
        return cost;
    }

    public int getDate() {
        return date;
    }
    
}
