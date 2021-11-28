package J07050.util;

public class Products implements Comparable<Products>{
    private String id, name, type;
    private double cost, sell, profit;

    public Products(int i, String name, String type, double cost, double sell) {
        this.id = "MH" + String.format("%02d", i);
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.sell = sell;
        this.profit = this.sell-this.cost;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + type + " " + String.format("%.2f", profit);
    }
    
    
    @Override
    public int compareTo(Products o) {
        if(this.profit < o.profit) return 1;
        return -1;
    }  
}

